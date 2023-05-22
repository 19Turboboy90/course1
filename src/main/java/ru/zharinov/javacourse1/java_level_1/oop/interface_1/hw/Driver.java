package ru.zharinov.javacourse1.java_level_1.oop.interface_1.hw;

public class Driver extends Employee implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Водит машину");
    }
}
