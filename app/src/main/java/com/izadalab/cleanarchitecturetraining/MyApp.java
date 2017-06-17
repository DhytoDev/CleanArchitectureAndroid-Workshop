package com.izadalab.cleanarchitecturetraining;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by izadalab on 6/17/17.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
