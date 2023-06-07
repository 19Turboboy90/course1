package ru.zharinov.javacourse1.java_level_2.collections.queu;

import ru.zharinov.javacourse1.java_level_2.collections.CarCollection;

public interface CarQueue<T> extends CarCollection<T> {
    boolean add(T car);

    T peek();

    T poll();
}
