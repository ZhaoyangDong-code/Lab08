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
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize + 1);
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
        list.deleteCity(city); // 这里会报错，因为方法还没写
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(city));
    }
}
