package com.example.lab08;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * It contains the name of the city and the province it belongs to.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return this.city;
    }

    public String getProvinceName() {
        return this.province;
    }

    /**
     * This compares this city to another city based on their names.
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Two cities are considered equal if they have the same name and province.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
