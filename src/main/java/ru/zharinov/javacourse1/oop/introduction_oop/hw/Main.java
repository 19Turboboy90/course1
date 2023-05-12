package ru.zharinov.javacourse1.oop.introduction_oop.hw;

/*
Создать класс Человек, в котором будет 3 поля: имя, возраст и вес.

В классе Main создать 5 экземпляров класса Человек, присвоить значения их полям и вывести на экран их средний возраст.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.age = 10;
        person1.name = "Ivan";
        person1.weight = 30;

        person2.age = 70;
        person2.name = "Nikolay";
        person2.weight = 120.3;

        person3.age = 35;
        person3.name = "Zaur";
        person3.weight = 80.5;

        person4.age = 1;
        person4.name = "Ilia";
        person4.weight = 8;

        person5.age = 18;
        person5.name = "Svetlana";
        person5.weight = 45;
        int avgAge = (person1.age + person2.age + person3.age + person4.age + person5.age) / 5;
        System.out.println("Средний возраст людей = " + avgAge);
    }
}
