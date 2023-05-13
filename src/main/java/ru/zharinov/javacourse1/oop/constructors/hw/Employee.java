package ru.zharinov.javacourse1.oop.constructors.hw;

public class Employee {
    String name;
    String position;

    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo(int i) {
        return "name: " + name + "\nposition: " + position + "\nsalary: " + salary +
                "\nsalary for i months: " + (salary * i);
    }
}
