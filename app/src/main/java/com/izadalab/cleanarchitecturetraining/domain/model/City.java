package com.izadalab.cleanarchitecturetraining.domain.model;


/**
 * Created by izadalab on 6/17/17.
 */

public class City {
    private int id;
    private String name;
    private String imageUrl;
    private String lastUpdated;

    public City(int id, String name, String imageUrl, String lastUpdated) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.lastUpdated = lastUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
