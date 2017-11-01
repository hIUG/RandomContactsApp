package com.allexis.randomcontactsapp.ui.screen.user;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allexis.randomcontactsapp.BR;
import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.core.base.databinding.fragment.BaseBindingFragment;
import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;
import com.allexis.randomcontactsapp.databinding.FragmentUserBinding;

/**
 * Created by allexis on 11/1/17.
 */
public class UserFragment extends BaseBindingFragment<UserFragmentViewModel, FragmentUserBinding> implements UserFragmentView {

    private static final String TAG = UserFragment.class.getName();

    public UserFragment() {
    }

    public static UserFragment newInstance() {
        UserFragment fragment = new UserFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    protected UserFragmentViewModel onCreateViewModel(FragmentUserBinding binding) {
        return new UserFragmentViewModel(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected int getVariable() {
        return BR.viewModel;
    }

    @Override
    protected String getFragmentTag() {
        return UserFragment.class.getCanonicalName();
    }

    @Override
    public void error(Throwable e) {
        showLongToast("We're having problems to fetch the data :/ please retry");
        Log.e(TAG, "error: ", e);
    }

    @Override
    public void displayUserResults(User user) {

    }
}
