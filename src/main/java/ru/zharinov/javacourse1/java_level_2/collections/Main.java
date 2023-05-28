package ru.zharinov.javacourse1.java_level_2.collections;

/*
Задача:

Написать систему учета автомобилей на парковке.

Требование к системе - наличие следующих методов:

Car get(int index); - получение информации об автомобиле по индексу

void add(Car car); - добавление нового автомобиля в список

boolean remove(Car car); - удаление автомобиля из списка (если элемент удален, то вернуть true, если нет - false)

boolean removeAt(int index); - удаление автомобиля из списка по его индексу (если элемент удален, то вернуть true, если
нет - false)

int size(); - количество автомобилей в системе

void clear(); - удаление все данные из списка

При любом обращении к индексу, который находится за пределами коллекции бросить исключение IndexOutOfBoundsException
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);
        System.out.println(car1 == car2);
    }
}
