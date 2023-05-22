package ru.zharinov.javacourse1.java_level_1.oop.interface_2.hw;

public class Director {
    public void force(Counter counter, int i) {
        System.out.println(counter.report(i));
    }
}
