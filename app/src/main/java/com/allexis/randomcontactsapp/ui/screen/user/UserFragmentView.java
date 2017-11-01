package com.allexis.randomcontactsapp.ui.screen.user;

import com.allexis.randomcontactsapp.core.base.databinding.IView;
import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;

/**
 * Created by allexis on 11/1/17.
 */

public interface UserFragmentView extends IView {

    void displayUserResults(User user);
}
