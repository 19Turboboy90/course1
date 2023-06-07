package ru.zharinov.javacourse1.java_level_2.collections;

import org.junit.Before;
import org.junit.Test;
import ru.zharinov.javacourse1.java_level_2.collections.set.CarHashSet;

import static org.junit.Assert.*;

public class CarCollectionTest {
    private CarCollection<Car> carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new CarHashSet<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void containsElementInCollection() {
        Car car = new Car("Brand0", 0);
        assertTrue(carCollection.contains(car));
    }

    @Test
    public void notContainsElementInCollection() {
        Car car = new Car("BMW", 1);
        assertFalse(carCollection.contains(car));
    }

    @Test
    public void testForeach() {
        int index = 0;
        for (Car car : carCollection) {
            index++;
        }
        assertEquals(100, index);
    }
}