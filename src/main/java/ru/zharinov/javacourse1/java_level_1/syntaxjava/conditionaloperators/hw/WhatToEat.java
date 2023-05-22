package ru.zharinov.javacourse1.java_level_1.syntaxjava.conditionaloperators.hw;

/*
Написать программу, которая советует вам, что купить в зависимости от количества денег в вашем кармане.
Например: если у вас больше 500 рублей, то программа выводит "Пицца", если 300-500, то "Шаурму",
если 100-300, то "Гамбургер", если меньше 100 рублей, то "Доширак".
 */
public class WhatToEat {
    public static void main(String[] args) {
        int money = 200;
        if (money >= 500) {
            System.out.println("Пицца");
        } else if (money >= 300) {
            System.out.println("Шаурма");
        } else if (money >= 100) {
            System.out.println("Гамбургер");
        } else if (money < 100) {
            System.out.println("Доширак");
        }
    }
}