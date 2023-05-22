package ru.zharinov.javacourse1.java_level_1.syntaxjava.datatypes.primitivedatatypes;

/*
    Написать программу, которая принимает радиус окружности и выводит на экран площадь круга,
    используется формула S= pi * r * r
 */
public class Square {
    public static void main(String[] args) {
        double radius = 10.8;
        double pi = 3.14;
        double square = pi * radius * radius;
        System.out.println("Плошадь круга равна: " + square);
    }
}