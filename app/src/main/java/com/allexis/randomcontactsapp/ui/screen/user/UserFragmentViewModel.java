package com.allexis.randomcontactsapp.ui.screen.user;

import android.databinding.Bindable;

import com.allexis.randomcontactsapp.BR;
import com.allexis.randomcontactsapp.core.base.databinding.fragment.BaseBindingFragmentViewModel;
import com.allexis.randomcontactsapp.core.network.service.randomuser.RandomUserController;
import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;
import com.allexis.randomcontactsapp.core.util.UserUtil;

/**
 * Created by allexis on 11/1/17.
 */

public class UserFragmentViewModel extends BaseBindingFragmentViewModel<UserFragment> {

    private RandomUserController controller;
    private User user;

    public UserFragmentViewModel(UserFragment fragment) {
        super(fragment);
        controller = new RandomUserController();
        fetchNewUser();
    }

    private void fetchNewUser() {
        controller.getRandomUser(userResult -> {
            if (userResult.getResults().size() > 0) {
                user = userResult.getResults().get(0);
                notifyPropertyChanged(BR.userName);
            }
        }, throwable -> getFragment().error(throwable));
    }

    @Bindable
    public UserFragmentViewModel getViewModel() {
        return this;
    }

    @Bindable
    public String getUserName() {
        if (user != null) {
            return UserUtil.getFullName(user);
        }
        return "No real data yet";
    }
}
