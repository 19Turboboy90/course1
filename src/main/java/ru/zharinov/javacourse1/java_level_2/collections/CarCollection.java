package ru.zharinov.javacourse1.java_level_2.collections;

public interface CarCollection extends Iterable<Car>{
    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();

    boolean contains(Car car);
}
