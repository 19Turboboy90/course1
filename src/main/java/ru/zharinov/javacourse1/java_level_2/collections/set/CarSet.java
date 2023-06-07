package ru.zharinov.javacourse1.java_level_2.collections.set;

import ru.zharinov.javacourse1.java_level_2.collections.CarCollection;

public interface CarSet<T> extends CarCollection<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();
}
