package ru.zharinov.javacourse1.oop.embedded_collections.hw;

import java.util.ArrayList;

/*
Создать 3 коллекции: в первой 10 чисел, во второй 10 имен (заполнить их произвольными значениями),
а третья коллекция должна автоматически заполняться строками, которые содержат число из первой коллекции,
потом знак тире и строку из второй коллекции.

Вывести все значения второй коллекции в цикле for each.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Сергей");
        names.add("Кристина");
        names.add("Елена");
        names.add("Виктор");
        names.add("Наталья");
        names.add("Иван");
        names.add("Константин");
        names.add("Валерия");
        names.add("Артем");
        names.add("Светлана");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
