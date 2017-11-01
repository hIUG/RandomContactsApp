package com.allexis.randomcontactsapp.core.di;

import com.allexis.randomcontactsapp.ui.screen.home.HomeActivity;
import com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by allexis on 11/1/17.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(UserFragmentViewModel userFragmentViewModel);

    void inject(HomeActivity homeActivity);
}
