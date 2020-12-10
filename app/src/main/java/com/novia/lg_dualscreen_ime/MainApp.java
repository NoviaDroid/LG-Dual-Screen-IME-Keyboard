package com.novia.lg_dualscreen_ime;

import android.app.Application;
import android.content.Context;

import me.weishu.reflection.Reflection;

public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Reflection.unseal(base);
    }
}
