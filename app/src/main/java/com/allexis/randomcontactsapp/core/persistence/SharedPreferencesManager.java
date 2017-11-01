package com.allexis.randomcontactsapp.core.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by allexis on 11/1/17.
 */

public class SharedPreferencesManager {

    private SharedPreferences sharedPrefs;

    public SharedPreferencesManager(final Context context) {
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void put(final String key, final String value) {
        sharedPrefs.edit().putString(key, value).apply();
    }

    public void put(final String key, final boolean value) {
        sharedPrefs.edit().putBoolean(key, value).apply();
    }

    public void put(final String key, final int value) {
        sharedPrefs.edit().putInt(key, value).apply();
    }

    public void put(final String key, final long value) {
        sharedPrefs.edit().putLong(key, value).apply();
    }

    public void put(final String key, final float value) {
        sharedPrefs.edit().putFloat(key, value).apply();
    }

    public String getString(final String key, final String defaultValue) {
        return sharedPrefs.getString(key, defaultValue);
    }

    public boolean getBoolean(final String key, final boolean defaultValue) {
        return sharedPrefs.getBoolean(key, defaultValue);
    }

    public int getInt(final String key, final int defaultValue) {
        return sharedPrefs.getInt(key, defaultValue);
    }

    public long getLong(final String key, final long defaultValue) {
        return sharedPrefs.getLong(key, defaultValue);
    }

    public float getFloat(final String key, final float defaultValue) {
        return sharedPrefs.getFloat(key, defaultValue);
    }

    public void remove(final String key) {
        sharedPrefs.edit().remove(key).apply();
    }
}
