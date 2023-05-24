package ru.zharinov.javacourse1.java_level_2.junit;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double multiple(int a, int b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        return a / b;
    }

    public double square(int a) {
        return Math.pow(a, 2);
    }
}
