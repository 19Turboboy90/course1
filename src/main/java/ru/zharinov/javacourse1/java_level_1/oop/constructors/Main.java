package ru.zharinov.javacourse1.java_level_1.oop.constructors;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10,15,20);
        System.out.println(box.volume());
        Box box2 = new Box(30,30,30);
        System.out.println(box2.volume());
    }
}
