package com.example.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service
{
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        stopSelf(); //stopping the service
        return super.onStartCommand(intent, flags, startId);

    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}