package com.example.administrator.bugly;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by ${sheldon} on 2016/12/20.
 */
public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "491dec97d8", false);
    }
}
