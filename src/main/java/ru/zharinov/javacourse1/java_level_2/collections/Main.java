package ru.zharinov.javacourse1.java_level_2.collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
Задача:

Написать систему учета автомобилей на парковке.

Требование к системе - наличие следующих методов:

Car get(int index); - получение информации об автомобиле по индексу

boolean add(Car car); - добавление нового автомобиля в список

boolean add(Car car, int index); - добавление нового автомобиля в список по индексу

boolean remove(Car car); - удаление автомобиля из списка (если элемент удален, то вернуть true, если нет - false)

boolean removeAt(int index); - удаление автомобиля из списка по его индексу (если элемент удален, то вернуть true, если
нет - false)

int size(); - количество автомобилей в системе

void clear(); - удаление все данные из списка

boolean contains(Car car); - возвращает true, если данный объект находится в коллекции

При любом обращении к индексу, который находится за пределами коллекции бросить исключение IndexOutOfBoundsException
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(100));
        }


        integers.forEach(System.out::println);
    }
}
