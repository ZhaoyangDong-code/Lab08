package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of {@link City} objects.
 */
public class CustomList {
    private List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * COUNT CITIES IS TEMPORARILY REMOVED FOR TDD RED PHASE PUSH
     */
    /*
    public int countCities() {
        return cities.size();
    }
    */
    
    public int getCount() {
        return cities.size();
    }
}
