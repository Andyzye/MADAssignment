package com.mad.madassignment;

import android.app.Application;

import com.firebase.client.Firebase;

public class MadApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
