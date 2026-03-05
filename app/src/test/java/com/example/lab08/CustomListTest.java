package com.example.lab08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void setup() {
        list = new CustomList();
    }

    @Test
    public void addCityTest() {
        // We can keep using getCount here if you want, but for countCities TDD:
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.getCount());
    }

    @Test
    public void testHasCity() {
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        City city = new City("Regina", "SK");
        list.addCity(city);
        assertEquals(1, list.getCount());
        list.deleteCity(city);
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        City city = new City("Charlottetown", "PEI");
        list.addCity(city);
        // This will fail because countCities() is not defined yet
        assertEquals(1, list.countCities());
    }
}
