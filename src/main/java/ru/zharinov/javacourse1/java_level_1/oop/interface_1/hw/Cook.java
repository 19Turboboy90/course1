package ru.zharinov.javacourse1.java_level_1.oop.interface_1.hw;

public class Cook extends Employee implements Cookable {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Готовит еду");
    }
}
