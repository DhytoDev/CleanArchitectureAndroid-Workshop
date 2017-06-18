package com.izadalab.cleanarchitecturetraining.data.repository.datasource;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;
import com.izadalab.cleanarchitecturetraining.data.net.ServiceGenerator;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Created by izadalab on 6/18/17.
 */

public class CityCloudDataStore implements CityDataStore {
    @Override
    public Observable<List<CityEntity>> citys() {
        return ServiceGenerator.getCityService().getCitys().doOnNext(new Consumer<List<CityEntity>>() {
            @Override
            public void accept(List<CityEntity> cityEntities) throws Exception {

            }
        });
    }
}
