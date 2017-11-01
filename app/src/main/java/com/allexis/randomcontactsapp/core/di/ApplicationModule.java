package com.allexis.randomcontactsapp.core.di;

import android.app.Application;

import com.allexis.randomcontactsapp.core.persistence.SharedPreferencesManager;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by allexis on 11/1/17.
 */

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferencesManager providesSharedPreferencesManager(Application application) {
        return new SharedPreferencesManager(application);
    }

    @Provides
    @Singleton
    FirebaseAuth provideFirebaseAuth() {
        return FirebaseAuth.getInstance();
    }
}
