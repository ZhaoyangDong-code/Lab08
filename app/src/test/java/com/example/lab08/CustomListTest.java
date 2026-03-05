package com.example.lab08;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity() {
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail because hasCity() hasn't been implemented yet
        assertTrue(list.hasCity(calgary));
    }
}
