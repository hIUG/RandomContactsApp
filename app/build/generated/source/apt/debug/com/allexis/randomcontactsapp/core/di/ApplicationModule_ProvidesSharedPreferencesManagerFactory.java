package com.allexis.randomcontactsapp.core.di;

import android.app.Application;
import com.allexis.randomcontactsapp.core.persistence.SharedPreferencesManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvidesSharedPreferencesManagerFactory implements Factory<SharedPreferencesManager> {
  private final ApplicationModule module;
  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvidesSharedPreferencesManagerFactory(ApplicationModule module, Provider<Application> applicationProvider) {  
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferencesManager get() {  
    SharedPreferencesManager provided = module.providesSharedPreferencesManager(applicationProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<SharedPreferencesManager> create(ApplicationModule module, Provider<Application> applicationProvider) {  
    return new ApplicationModule_ProvidesSharedPreferencesManagerFactory(module, applicationProvider);
  }
}

