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

    /**
     * This deletes a city from the list if the city exists.
     * @param city
     *      This is a candidate city to delete
     * @throws IllegalArgumentException
     *      Thrown if the city does not exist in the list
     */
    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    public int countCities() {
        return cities.size();
    }
    
    public int getCount() {
        return cities.size();
    }
}
