package ru.zharinov.javacourse1.java_level_2.collections.list;

import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.CarCollection;

public interface CarList extends CarCollection {
    Car get(int index);

    boolean add(Car car);

    boolean add(Car car, int index);

    boolean remove(Car car);

    boolean removeAt(int index);

    int size();

    void clear();
}
