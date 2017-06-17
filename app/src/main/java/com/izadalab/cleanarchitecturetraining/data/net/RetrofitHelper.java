package com.izadalab.cleanarchitecturetraining.data.net;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by izadalab on 6/17/17.
 */

public class RetrofitHelper {

    private static Retrofit retrofit ;

    public static Retrofit getRetrofit() {

        if (retrofit != null)
            return retrofit ;

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit ;
    }
}
