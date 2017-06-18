package com.izadalab.cleanarchitecturetraining.data.net;

 /**
 * Created by izadalab on 6/17/17.
 */

public class ServiceGenerator {

    private static CityService cityService ;

    public static CityService getCityService() {

        if (cityService == null) {
            cityService = RetrofitHelper.getRetrofit().create(CityService.class);
        }

        return cityService ;
    }
}
