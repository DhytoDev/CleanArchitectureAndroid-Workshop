package com.izadalab.cleanarchitecturetraining.data.repository.datasource;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by izadalab on 6/18/17.
 */

public interface CityDataStore {

    Observable<List<CityEntity>> citys();
}
