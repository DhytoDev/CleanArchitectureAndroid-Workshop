package com.izadalab.cleanarchitecturetraining.data.net;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by izadalab on 6/17/17.
 */

public interface CityService {

    @GET("bins/n4won")
    Observable<List<CityEntity>> getCitys() ;
}
