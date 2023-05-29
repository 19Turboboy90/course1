package ru.zharinov.javacourse1.java_level_2.collections.set;

import ru.zharinov.javacourse1.java_level_2.collections.Car;

public interface CarSet {
    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();
}
