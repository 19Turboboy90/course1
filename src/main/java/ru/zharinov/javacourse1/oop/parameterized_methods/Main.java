package ru.zharinov.javacourse1.oop.parameterized_methods;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimes(10, 10, 10);
        System.out.println(box.volume());
    }
}
