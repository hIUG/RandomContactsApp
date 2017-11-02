package com.allexis.randomcontactsapp.ui.screen.home;

import android.support.v7.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final MembersInjector<AppCompatActivity> supertypeInjector;
  private final Provider<FirebaseAuth> authProvider;

  public HomeActivity_MembersInjector(MembersInjector<AppCompatActivity> supertypeInjector, Provider<FirebaseAuth> authProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert authProvider != null;
    this.authProvider = authProvider;
  }

  @Override
  public void injectMembers(HomeActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.auth = authProvider.get();
  }

  public static MembersInjector<HomeActivity> create(MembersInjector<AppCompatActivity> supertypeInjector, Provider<FirebaseAuth> authProvider) {  
      return new HomeActivity_MembersInjector(supertypeInjector, authProvider);
  }
}

