package ru.zharinov.javacourse1.java_level_2.collections.map;

import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.set.CarOwner;

import java.util.List;
import java.util.Set;

public interface CarMap {
    void put(CarOwner key, Car value);

    Car get(CarOwner key);

    Set<CarOwner> keySet();

    List<Car> values();

    boolean remove(CarOwner key);

    int size();

    void clear();
}
