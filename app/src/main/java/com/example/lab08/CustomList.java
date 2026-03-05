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
     * This returns the number of cities in the list.
     * @return
     *      Return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
    
    public int getCount() {
        return cities.size();
    }
}
