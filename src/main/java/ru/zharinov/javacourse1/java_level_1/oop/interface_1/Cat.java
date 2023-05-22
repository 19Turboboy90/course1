package ru.zharinov.javacourse1.java_level_1.oop.interface_1;

public class Cat extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Вискас");
    }
    public void run(){
        System.out.println("Кот бежит");
    }
}
