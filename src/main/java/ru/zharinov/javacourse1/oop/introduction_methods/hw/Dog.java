package ru.zharinov.javacourse1.oop.introduction_methods.hw;

public class Dog {
    String name;
    String breed;
    int speed;

    public void run() {

        for (int i = 1; i <= speed; i++) {
            System.out.print("Бегу");
            if (i == speed) {
                System.out.println("...");
            } else {
                System.out.print(", ");
            }
        }
    }

    String info() {
        return "Имя собаки: " + name + ",\nПорода: " + breed + ",\nСкорость: " + speed;
    }
}
