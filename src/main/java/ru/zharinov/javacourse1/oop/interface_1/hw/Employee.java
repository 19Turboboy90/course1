package ru.zharinov.javacourse1.oop.interface_1.hw;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name);
    }
}
