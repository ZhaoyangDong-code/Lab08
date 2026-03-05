package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of {@link City} objects.
 */
public class CustomList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist.
     * @param city
     *      This is a candidate city to add
     * @throws IllegalArgumentException
     *      Thrown if the city already exists in the list
     */
    public void addCity(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities.
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city is in the list.
     * @param city
     *      This is the city to check for
     * @return
     *      Return true if the city is in the list, false otherwise
     */
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

    /**
     * This returns the number of cities in the list.
     * @return
     *      Return the number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * For compatibility with previous tests. Returns the number of cities.
     * @return
     *      The size of the list
     */
    public int getCount() {
        return cities.size();
    }
}
