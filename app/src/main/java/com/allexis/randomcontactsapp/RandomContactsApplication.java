package com.allexis.randomcontactsapp;

import android.app.Application;

import com.allexis.randomcontactsapp.core.di.ApplicationComponent;
import com.allexis.randomcontactsapp.core.di.ApplicationModule;
import com.allexis.randomcontactsapp.core.di.DaggerApplicationComponent;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by allexis on 11/1/17.
 */

public class RandomContactsApplication extends Application {

    private static ApplicationComponent component;

    public static ApplicationComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }

        LeakCanary.install(this);

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
