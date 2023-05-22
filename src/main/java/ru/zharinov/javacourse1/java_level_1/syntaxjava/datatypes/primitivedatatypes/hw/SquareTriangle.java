package ru.zharinov.javacourse1.java_level_1.syntaxjava.datatypes.primitivedatatypes.hw;

/*
Написать программу, которая принимает значение катетов A и B, и выводит на экран значение гипотенузы C.
Использовать теорему Пифагора
*/
public class SquareTriangle {
    public static void main(String[] args) {
        double a = 3.5;
        double b = 4.5;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Площадь треугольника: " + c);
    }
}
