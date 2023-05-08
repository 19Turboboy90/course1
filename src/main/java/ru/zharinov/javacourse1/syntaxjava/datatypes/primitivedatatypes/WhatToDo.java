package ru.zharinov.javacourse1.syntaxjava.datatypes.primitivedatatypes;

/*
Задача:
Напишите программу, которая принимает 2 параметра типа Boolean, первый показывает, что уже ночь, второй - показывает,
что на улице хорошая погода. И в зависимости от условий показывает, что вам делать.
Если уже ночь, то выводится надпись "Спать". Если сейчас день и на улице хорошая погода, тогда надпись "Гулять".
Если сейчас день и на улице плохая погода, тогда "Читать книгу.

Все условия должны храниться в отдельных переменных.
Не используйте else
 */
public class WhatToDo {
    public static void main(String[] args) {
        int time = 3;
        boolean night = time >= 23 || time <= 5;
        boolean goodWeather = false;
        if (night) {
            System.out.println("Спать");
        }
        if (goodWeather && !night) {
            System.out.println("Гулять");
        }
        if (!goodWeather && !night) {
            System.out.println("Читать книгу");
        }
    }
}
