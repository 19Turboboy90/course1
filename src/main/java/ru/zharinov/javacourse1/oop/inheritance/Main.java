package ru.zharinov.javacourse1.oop.inheritance;

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
