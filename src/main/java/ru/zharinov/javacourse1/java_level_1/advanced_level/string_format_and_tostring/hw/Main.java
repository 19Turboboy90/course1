package ru.zharinov.javacourse1.java_level_1.advanced_level.string_format_and_tostring.hw;

/*
Написать программу, которая выводит на экран случайное число от 10 до 100, в виде строки
"Случайное число .... Попробуйте еще раз", где строка формируется при помощи String.format.
 */
public class Main {
    public static void main(String[] args) {
        int result = -1;
        while (result != 99) {
            result = (int) (Math.random() * 90 + 10);
            System.out.printf("Случайное число %s. Попробуйте еще раз%n", result);
        }
    }
}
