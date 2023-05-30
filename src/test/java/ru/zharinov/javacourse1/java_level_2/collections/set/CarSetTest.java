package ru.zharinov.javacourse1.java_level_2.collections.set;

import org.junit.Before;
import org.junit.Test;
import ru.zharinov.javacourse1.java_level_2.collections.Car;

import static org.junit.Assert.*;

public class CarSetTest {
    private CarSet carSet;

    @Before
    public void setUp() throws Exception {
        carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void add() {
        assertEquals(100, carSet.size());
    }

    @Test
    public void addAlreadyExistElement() {
        assertEquals(100, carSet.size());
        Car car = new Car("BMW", 14);
        assertTrue(carSet.add(car));
        assertFalse(carSet.add(car));
        assertFalse(carSet.add(car));
        assertEquals(101, carSet.size());
    }

    @Test
    public void remove() {
        Car car = new Car("Brand0", 0);
        assertTrue(carSet.remove(car));
        assertEquals(99, carSet.size());
    }

    @Test
    public void removeNotExistElement() {
        Car car = new Car("BMW", 15);
        assertFalse(carSet.remove(car));
        assertEquals(100, carSet.size());
    }

    @Test
    public void size() {
        assertEquals(100, carSet.size());
    }

    @Test
    public void clear() {
        carSet.clear();
        assertEquals(0, carSet.size());
    }

    @Test
    public void containsElementInCollection() {
        Car car = new Car("Brand0", 0);
        assertTrue(carSet.contains(car));
    }

    @Test
    public void notContainsElementInCollection() {
        Car car = new Car("BMW", 1);
        assertFalse(carSet.contains(car));
    }
}