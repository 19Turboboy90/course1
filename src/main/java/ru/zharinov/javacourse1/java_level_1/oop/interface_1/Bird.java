package ru.zharinov.javacourse1.java_level_1.oop.interface_1;

public class Bird extends Animal implements CanRun, Flyable {
    @Override
    public void eat() {
        System.out.println("Птичий корм корм");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
