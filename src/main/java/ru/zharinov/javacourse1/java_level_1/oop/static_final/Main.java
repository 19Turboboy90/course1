package ru.zharinov.javacourse1.java_level_1.oop.static_final;

public class Main {
    public static void main(String[] args) {
        int square = MyMath.square(20);
        double length = MyMath.length(10);
        double area = MyMath.area(10);
        int sum = MyMath.sum(1, 4);
        System.out.println(sum);
        System.out.println(square);
        System.out.println(area);
        System.out.println(length);
        System.out.println(square);
    }
}
