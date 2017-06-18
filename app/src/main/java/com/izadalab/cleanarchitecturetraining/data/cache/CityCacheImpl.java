package com.izadalab.cleanarchitecturetraining.data.cache;

import android.util.Log;

import com.izadalab.cleanarchitecturetraining.data.entity.CityEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import io.reactivex.Observable;
import io.realm.Realm;

/**
 * Created by izadalab on 6/18/17.
 */

public class CityCacheImpl implements CityCache {

    private static final long EXPIRATION_TIME = 60 * 10 * 1000;

    @Override
    public boolean isExpired() {
        Realm realm = Realm.getDefaultInstance() ;
        if(realm.where(CityEntity.class).count() != 0) {

            Date currentTime = new Date(System.currentTimeMillis());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH);
            Date lastUpdated = null;

            try {
                lastUpdated = dateFormat.parse(realm.where(CityEntity.class).findFirst().getLastUpdated());
                boolean isExpired = currentTime.getTime() - lastUpdated.getTime() > EXPIRATION_TIME;

                if(isExpired) {
                    realm.beginTransaction();
                    realm.delete(CityEntity.class);
                    realm.commitTransaction();
                    realm.close();
                }

                return isExpired ;

            } catch (ParseException e) {
                Log.e("ParseException", e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean isCached() {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(CityEntity.class).findAll() != null &&
                realm.where(CityEntity.class).findAll().size() > 0;
    }

    @Override
    public Observable<List<CityEntity>> get() {

        Realm realm = Realm.getDefaultInstance() ;
        List<CityEntity> cityEntities = realm.where(CityEntity.class).findAll();
        return Observable.just(cityEntities);
    }

    @Override
    public void put(List<CityEntity> cityEntities) {

    }
}
