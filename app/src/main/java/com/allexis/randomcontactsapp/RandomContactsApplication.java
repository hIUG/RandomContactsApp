package com.allexis.randomcontactsapp;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by allexis on 11/1/17.
 */

public class RandomContactsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
