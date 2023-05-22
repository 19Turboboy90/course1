package ru.zharinov.javacourse1.java_level_1.oop.introduction_methods;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.length = 5;
        box1.height = 5;
        box1.width = 5;
        box2.length = 10;
        box2.height = 10;
        box2.width = 10;
        double volume1 = box1.volume();
        double volume2 = box2.volume();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}
