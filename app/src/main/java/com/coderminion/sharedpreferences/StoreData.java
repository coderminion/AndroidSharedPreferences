package com.coderminion.sharedpreferences;

/**
 * Created by phoenix on 18/8/17.
 */


import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class StoreData {
    public static SharedPreferences SharedPref;
    static String savedValue;
    static Boolean tempBoolean;
    static int savedIntValue;

    public static void SaveString(String key, String value) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        SharedPreferences.Editor editor = SharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    //
    public static String LoadString(String key) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        savedValue = SharedPref.getString(key, "");
        return savedValue;
    }

    public static String LoadString(String key, String defaultString ) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        savedValue = SharedPref.getString(key, defaultString);
        return savedValue;
    }

    public static Boolean LoadBoolean(String key) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        tempBoolean = SharedPref.getBoolean(key, false);
        return tempBoolean;
    }

    public static Boolean LoadBoolean(String key, boolean defaultValue) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        tempBoolean = SharedPref.getBoolean(key, defaultValue);
        return tempBoolean;
    }

    public static void SaveBoolean(String key, Boolean value) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        SharedPreferences.Editor editor = SharedPref.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }


    public static void SaveInt(String key, int value) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        SharedPreferences.Editor editor = SharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }
    
    public static int LoadInt(String key) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        savedIntValue = SharedPref.getInt(key, 0);
        return savedIntValue;
    }

    public static int LoadInt(String key, int defaultValue) {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        savedIntValue = SharedPref.getInt(key, defaultValue);
        return savedIntValue;
    }

    public static void ClearAll() {
        SharedPref = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        SharedPref.edit().clear().apply();
    }


}