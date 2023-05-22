package ru.zharinov.javacourse1.java_level_1.oop.inheritance_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Leon leon = new Leon();
        cat.showInfo();
        leon.showInfo();
        cat.eat();
        leon.eat();
    }
}
