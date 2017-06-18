package com.izadalab.cleanarchitecturetraining.data.cache;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by izadalab on 6/18/17.
 */

public interface CityCache {
    boolean isExpired();
    boolean isCached();
    Observable<List<CityEntity>> get();
    void put(List<CityEntity> cityEntities);
}
