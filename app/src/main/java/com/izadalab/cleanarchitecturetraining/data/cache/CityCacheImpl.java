package com.izadalab.cleanarchitecturetraining.data.cache;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by izadalab on 6/18/17.
 */

public class CityCacheImpl implements CityCache {
    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean isCached() {
        return false;
    }

    @Override
    public Observable<List<CityEntity>> get() {
        return null;
    }

    @Override
    public void put(List<CityEntity> cityEntities) {

    }
}
