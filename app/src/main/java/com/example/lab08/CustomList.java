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
}
