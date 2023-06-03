package ru.zharinov.javacourse1.java_level_2.collections.queu;

import ru.zharinov.javacourse1.java_level_2.collections.Car;
import ru.zharinov.javacourse1.java_level_2.collections.CarCollection;

public interface CarQueue extends CarCollection {
    boolean add(Car car);

    Car peek();

    Car poll();

}
