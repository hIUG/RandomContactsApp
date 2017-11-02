package com.allexis.randomcontactsapp.ui.screen.user;

import android.databinding.Bindable;

import com.allexis.randomcontactsapp.BR;
import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.core.base.databinding.fragment.BaseBindingFragmentViewModel;
import com.allexis.randomcontactsapp.core.network.service.randomuser.RandomUserController;
import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;
import com.allexis.randomcontactsapp.core.persistence.SharedPreferencesManager;
import com.allexis.randomcontactsapp.core.util.UserUtil;

import javax.inject.Inject;

/**
 * Created by allexis on 11/1/17.
 */

public class UserFragmentViewModel extends BaseBindingFragmentViewModel<UserFragment> {

    @Inject
    SharedPreferencesManager sharedPreferencesManager;
    private RandomUserController controller;
    private User user;
    private String displayName;

    public UserFragmentViewModel(UserFragment fragment) {
        super(fragment);
        controller = new RandomUserController();
        fetchNewUser();
    }

    protected void fetchNewUser() {
        controller.getRandomUser(userResult -> {
            if (userResult.getResults().size() > 0) {
                user = userResult.getResults().get(0);
                notifyPropertyChanged(BR._all);
            }
        }, throwable -> getFragment().error(throwable));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        controller.dispose();
    }

    public void handleDismissClick() {
        getFragment().showShortToast("So sad :'( ... Do you like better this other user?");
        fetchNewUser();
    }

    public void handleLikeClick() {
        getFragment().showShortToast("Ok, you like this user!");
    }

    @Bindable
    public UserFragmentViewModel getViewModel() {
        return this;
    }

    @Bindable
    public User getUser() {
        return user;
    }

    @Bindable
    public String getUserName() {
        return UserUtil.getFullName(user);
    }

    @Bindable
    public String getUserLocation() {
        return UserUtil.getLocation(user);
    }

    @Bindable
    public String getDisplayName() {
        return String.format(getActivity().getString(R.string.hi_message), displayName == null ? "" : displayName);
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
