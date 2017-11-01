package com.allexis.randomcontactsapp.ui.screen.home;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.ui.screen.user.UserFragment;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by allexis on 10/11/17.
 */
public class HomeActivity extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        auth = FirebaseAuth.getInstance();

        UserFragment fragment = UserFragment.newInstance();
        goToNewFragment(fragment, fragment.getTag(), false);
        if (auth.getCurrentUser() != null) {
//            processSignedIn();
        } else {
            //doSignIn();
//            CompositeDisposable compositeDisposable = new CompositeDisposable();
//            compositeDisposable.add(new Observable<List<UserResult>>()
//                    .subscribeOn()
//                    .map(new Function<List<UserResult>, UserResult>() {
//                        @Override
//                        public UserResult apply(List<UserResult> userResults) throws Exception {
//                            return userResults.get(0);
//                        }
//                    })
//                    .map((Function<List<UserResult>, UserResult>) userResults -> userResults.get(0))
//                    .subscribe(r -> {
//                        Log.d("TAG", "accept: " + r + "accepted");
//                        r.toString();
//                    }, throwable -> {
//                        Log.e("TAG", "accept: throwable accepted", throwable);
//                        throwable.toString();
//                    })
//                    .subscribe(new Consumer<R>() {
//                        @Override
//                        public void accept(R r) throws Exception {
//                            Log.d("TAG", "accept: " + r + "accepted");
//                            r.toString();
//                        }
//                    }, new Consumer<Throwable>() {
//                        @Override
//                        public void accept(Throwable throwable) throws Exception {
//                            Log.e("TAG", "accept: throwable accepted", throwable);
//                            throwable.toString();
//                        }
//                    }));
        }
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
