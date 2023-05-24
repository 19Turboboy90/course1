package ru.zharinov.javacourse1.java_level_2.junit;
/*
Дз. Доработать калькулятор. Добавить методы для умножения, деления и вычитания.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.sum(10, 5));
    }
}
