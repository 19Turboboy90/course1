package ru.zharinov.javacourse1.oop.own_collection;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Ivan");
        employees.add("Ilia");
        employees.add("Slava");
        for (int i = 1; i <= 100; i++) {
            employees.add("Employee " + i);
        }
        employees.remove(102);
        employees.remove("Employee 99");
        employees.remove("Employee 98");
        employees.remove("Employee 97");
        employees.remove("Employee 96");
        System.out.println(employees.getSize());
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
