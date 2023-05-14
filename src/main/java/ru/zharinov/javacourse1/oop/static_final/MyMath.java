package ru.zharinov.javacourse1.oop.static_final;

public class MyMath {
    private static final double PI = 3.14;

    public static int square(int num) {
        return num * num;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
