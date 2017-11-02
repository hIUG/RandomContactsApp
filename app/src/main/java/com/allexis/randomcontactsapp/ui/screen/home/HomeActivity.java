package com.allexis.randomcontactsapp.ui.screen.home;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.RandomContactsApplication;
import com.allexis.randomcontactsapp.ui.screen.user.UserFragment;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ErrorCodes;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;
import java.util.Collections;

import javax.inject.Inject;

/**
 * Created by allexis on 10/11/17.
 */
public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();

    private static final int RC_SIGN_IN = 123;
    private static final int RC_2FA = 456;

    @Inject
    FirebaseAuth auth;

    private String authDisplayName;
    private boolean skip2FA = true; //for debugging

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RandomContactsApplication.getComponent().inject(this);

        verifyLoginStatus();
    }

    private void verifyLoginStatus() {
        if (auth.getCurrentUser() != null) {
            perform2FA();
        } else {
            doSignIn();
        }
    }

    private void doSignIn() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(Arrays.asList(new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build()))
                        .setIsSmartLockEnabled(false)
                        .build(),
                RC_SIGN_IN);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if (resultCode == Activity.RESULT_OK) {
                authDisplayName = auth.getCurrentUser().getDisplayName();
                perform2FA();
            } else {
                if (response == null) {
                    // User pressed back button
                    Log.e(TAG, "Sign in cancelled");
                }
                if (response.getErrorCode() == ErrorCodes.NO_NETWORK) {
                    Log.e("HACE:ERR:", "No network...");
                }

                if (response.getErrorCode() == ErrorCodes.UNKNOWN_ERROR) {
                    Log.e("HACE:ERR:", "Unknown sign in error");
                }
                verifyLoginStatus();
            }
        } else if (requestCode == RC_2FA) {
            if (resultCode == Activity.RESULT_OK) {
                goToUserFragment();
            } else {
                auth.signOut();
                verifyLoginStatus();
            }
        }
    }

    private void perform2FA() {
        if (skip2FA) {
            goToUserFragment();
            return;
        }
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(Collections.singletonList(new AuthUI.IdpConfig.Builder(AuthUI.PHONE_VERIFICATION_PROVIDER).build()))
                        .build(),
                RC_2FA);
    }

    private void goToUserFragment() {
        UserFragment fragment = UserFragment.newInstance(authDisplayName);
        goToNewFragment(fragment, fragment.getTag(), false);
    }

    public void goToNewFragment(Fragment fragment, String fragmentTag, boolean addToBackStack) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_content_layout, fragment, fragmentTag);
        if (addToBackStack) {
            transaction.addToBackStack(fragmentTag);
        }
        transaction.commit();
    }
}
