package com.coderminion.sharedpreferences;

import android.app.Application;

/**
 * Created by phoenix on 18/8/17.
 */

public class MyApplication extends Application {

    static MyApplication myApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication =this;

    }

    public static MyApplication getInstance()
    {
        return myApplication;
    }
}
