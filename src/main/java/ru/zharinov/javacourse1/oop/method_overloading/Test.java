package ru.zharinov.javacourse1.oop.method_overloading;

public class Test {
    static int multiple(int a, int b) {
        return a * b;
    }

    static double multiple(double a, double b) {
        return a * b;
    }

    static int multiple(int a) {
        return a * a;
    }
}
