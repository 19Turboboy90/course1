package ru.zharinov.javacourse1.java_level_2.collections;

public interface CarList {
    Car get(int index);

    void add(Car car);

    void add(Car car, int index);

    boolean remove(Car car);

    boolean removeAt(int index);

    int size();

    void clear();
}
