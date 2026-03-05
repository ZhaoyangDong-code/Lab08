package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public int getCount() {
        return cities.size();
    }

    /**
     * This checks if the city belongs to the list
     * @param city
     *      the city to check
     * @return
     *      true if the city belongs to the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city from the list
     * @param city
     *      the city to delete
     * @throws IllegalArgumentException
     *      if the city is not in the list
     */
    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found");
        }
        cities.remove(city);
    }
}
