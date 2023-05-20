package ru.zharinov.javacourse1.oop.interface_1;

public class Dog extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Кость");
    }

    public void run(){
        System.out.println("Собака бежит");
    }
}
