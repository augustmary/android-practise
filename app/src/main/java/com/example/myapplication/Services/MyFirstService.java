package com.example.myapplication.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyFirstService extends Service {

    public static final String TAG = "MyFirstServiceTAG";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Service began its creation!");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "Service began its launch! - on start command");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Service was destroyed - on Destroy!");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
