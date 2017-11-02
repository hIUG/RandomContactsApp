package com.allexis.randomcontactsapp.core.di;

import android.app.Application;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvidesApplicationFactory implements Factory<Application> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidesApplicationFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Application get() {  
    Application provided = module.providesApplication();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Application> create(ApplicationModule module) {  
    return new ApplicationModule_ProvidesApplicationFactory(module);
  }
}

