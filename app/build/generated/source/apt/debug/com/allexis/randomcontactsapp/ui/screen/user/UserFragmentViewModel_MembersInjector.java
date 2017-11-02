package com.allexis.randomcontactsapp.ui.screen.user;

import com.allexis.randomcontactsapp.core.base.databinding.fragment.BaseBindingFragmentViewModel;
import com.allexis.randomcontactsapp.core.persistence.SharedPreferencesManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserFragmentViewModel_MembersInjector implements MembersInjector<UserFragmentViewModel> {
  private final MembersInjector<BaseBindingFragmentViewModel<UserFragment>> supertypeInjector;
  private final Provider<SharedPreferencesManager> sharedPreferencesManagerProvider;

  public UserFragmentViewModel_MembersInjector(MembersInjector<BaseBindingFragmentViewModel<UserFragment>> supertypeInjector, Provider<SharedPreferencesManager> sharedPreferencesManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert sharedPreferencesManagerProvider != null;
    this.sharedPreferencesManagerProvider = sharedPreferencesManagerProvider;
  }

  @Override
  public void injectMembers(UserFragmentViewModel instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.sharedPreferencesManager = sharedPreferencesManagerProvider.get();
  }

  public static MembersInjector<UserFragmentViewModel> create(MembersInjector<BaseBindingFragmentViewModel<UserFragment>> supertypeInjector, Provider<SharedPreferencesManager> sharedPreferencesManagerProvider) {  
      return new UserFragmentViewModel_MembersInjector(supertypeInjector, sharedPreferencesManagerProvider);
  }
}

