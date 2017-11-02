package com.allexis.randomcontactsapp.core.di;

import android.app.Application;
import com.allexis.randomcontactsapp.core.persistence.SharedPreferencesManager;
import com.allexis.randomcontactsapp.ui.screen.home.HomeActivity;
import com.allexis.randomcontactsapp.ui.screen.home.HomeActivity_MembersInjector;
import com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel;
import com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel_MembersInjector;
import com.google.firebase.auth.FirebaseAuth;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Application> providesApplicationProvider;
  private Provider<SharedPreferencesManager> providesSharedPreferencesManagerProvider;
  private MembersInjector<UserFragmentViewModel> userFragmentViewModelMembersInjector;
  private Provider<FirebaseAuth> provideFirebaseAuthProvider;
  private MembersInjector<HomeActivity> homeActivityMembersInjector;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.providesApplicationProvider = ScopedProvider.create(ApplicationModule_ProvidesApplicationFactory.create(builder.applicationModule));
    this.providesSharedPreferencesManagerProvider = ScopedProvider.create(ApplicationModule_ProvidesSharedPreferencesManagerFactory.create(builder.applicationModule, providesApplicationProvider));
    this.userFragmentViewModelMembersInjector = UserFragmentViewModel_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providesSharedPreferencesManagerProvider);
    this.provideFirebaseAuthProvider = ScopedProvider.create(ApplicationModule_ProvideFirebaseAuthFactory.create(builder.applicationModule));
    this.homeActivityMembersInjector = HomeActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideFirebaseAuthProvider);
  }

  @Override
  public void inject(UserFragmentViewModel userFragmentViewModel) {  
    userFragmentViewModelMembersInjector.injectMembers(userFragmentViewModel);
  }

  @Override
  public void inject(HomeActivity homeActivity) {  
    homeActivityMembersInjector.injectMembers(homeActivity);
  }

  public static final class Builder {
    private ApplicationModule applicationModule;
  
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      if (applicationModule == null) {
        throw new IllegalStateException("applicationModule must be set");
      }
      return new DaggerApplicationComponent(this);
    }
  
    public Builder applicationModule(ApplicationModule applicationModule) {  
      if (applicationModule == null) {
        throw new NullPointerException("applicationModule");
      }
      this.applicationModule = applicationModule;
      return this;
    }
  }
}

