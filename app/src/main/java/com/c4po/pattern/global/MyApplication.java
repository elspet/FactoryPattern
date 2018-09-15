package com.c4po.pattern.global;

import android.app.Application;

/**
 * function
 * @author Lisa
 * @date 2018/9/15
 */

public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance(){
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }
}
