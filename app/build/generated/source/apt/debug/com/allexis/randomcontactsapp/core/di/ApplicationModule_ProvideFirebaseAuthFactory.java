package com.allexis.randomcontactsapp.core.di;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideFirebaseAuthFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public FirebaseAuth get() {  
    FirebaseAuth provided = module.provideFirebaseAuth();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<FirebaseAuth> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideFirebaseAuthFactory(module);
  }
}

