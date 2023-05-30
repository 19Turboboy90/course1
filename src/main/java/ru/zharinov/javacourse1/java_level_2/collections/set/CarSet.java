package ru.zharinov.javacourse1.java_level_2.collections.set;

import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.CarCollection;

public interface CarSet extends CarCollection {
    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();
}
