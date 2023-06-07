package ru.zharinov.javacourse1.java_level_2.collections.map;

import org.junit.Before;
import org.junit.Test;
import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.set.CarOwner;

import static org.junit.Assert.*;

public class CarMapTest {
    private CarMap<CarOwner, Car> carMap;

    @Before
    public void setUp() throws Exception {
        carMap = new CarHashMap<>();
    }

    @Test
    public void put() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, carMap.size());
    }

    @Test
    public void putAlreadyExistCarOwnerInCollection() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, carMap.size());
        CarOwner carOwner = new CarOwner(1, "Name1", "LastName1");
        Car car = new Car("Brand" + 150, 150);
        carMap.put(carOwner, car);
        assertEquals(100, carMap.size());
    }

    @Test
    public void get() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        CarOwner carOwner = new CarOwner(1, "Name1", "LastName1");
        Car car = carMap.get(carOwner);
        String expectedCar = "Brand1";
        assertEquals(expectedCar, car.getBrand());
    }

    @Test
    public void remove() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, carMap.size());
        CarOwner carOwner = new CarOwner(1, "Name1", "LastName1");
        assertTrue(carMap.remove(carOwner));
        assertEquals(99, carMap.size());
    }

    @Test
    public void removeNotExistElement() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        CarOwner carOwner = new CarOwner(1000, "Ivan", "Ivanov");
        assertFalse(carMap.remove(carOwner));
        assertEquals(100, carMap.size());
    }

    @Test
    public void size() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, carMap.size());
    }

    @Test
    public void clear() {
        for (int i = 0; i < 100; i++) {
            carMap.put(new CarOwner(i, "Name" + i, "LastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, carMap.size());
        carMap.clear();
        assertEquals(0, carMap.size());
    }

    @Test
    public void whenPut100ElementsThenSizeBecome100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            carMap.put(carOwner, car);
        }
        assertEquals(100, carMap.size());
    }

    @Test
    public void whenPut100ElementsWith10DifferentKeysThenSize10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index, "Name" + index, "LastName" + index);
            Car car = new Car("Brand" + index, index);
            carMap.put(carOwner, car);
        }
        assertEquals(10, carMap.size());
    }

    @Test
    public void removeReturnTrueOnlyOnce() {
        for (int i = 0; i < 10; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            carMap.put(carOwner, car);
        }
        assertEquals(10, carMap.size());

        CarOwner elementForDeleting = new CarOwner(5, "Name5", "LastName5");
        assertTrue(carMap.remove(elementForDeleting));
        assertEquals(9, carMap.size());
        assertFalse(carMap.remove(elementForDeleting));
    }

    @Test
    public void countOfKeysMustBeEqualsToCountOfValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            carMap.put(carOwner, car);
        }
        assertEquals(100, carMap.size());
        assertEquals(100, carMap.keySet().size());
        assertEquals(100, carMap.values().size());
    }

    @Test
    public void methodGetMustReturnRightValue() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            carMap.put(carOwner, car);
        }
        CarOwner key = new CarOwner(50, "Name50", "LastName50");
        Car value = carMap.get(key);
        String expectedCarBrand = "Brand50";
        assertEquals(expectedCarBrand, value.getBrand());
    }
}
