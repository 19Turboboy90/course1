package ru.zharinov.javacourse1.java_level_2.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {

    private CarList carList;

    @Before
    public void setUp() throws Exception {
        carList = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void get() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }

    @Test
    public void add() {
        assertEquals(100, carList.size());
    }

    @Test
    public void remove() {
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void removeNonExistElement() {
        Car car = new Car("Toyota", 15);
        assertEquals(100, carList.size());
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void removeAt() {
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }

    @Test
    public void clear() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsExceptions() {
        carList.get(100);
    }

    @Test
    public void addElementIntroMiddle() {
        Car car = new Car("BMW", 1);
        carList.add(car, 50);
        assertEquals(car, carList.get(50));
    }

    @Test
    public void addElementIntroFirstPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 0);
        assertEquals(car, carList.get(0));
    }

    @Test
    public void addElementIntroLastPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 100);
        assertEquals(car, carList.get(100));
    }
}