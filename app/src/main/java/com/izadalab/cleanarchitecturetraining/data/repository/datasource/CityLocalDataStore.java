package com.izadalab.cleanarchitecturetraining.data.repository.datasource;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by izadalab on 6/18/17.
 */

public class CityLocalDataStore implements CityDataStore {
    @Override
    public Observable<List<CityEntity>> citys() {
        return null;
    }
}
