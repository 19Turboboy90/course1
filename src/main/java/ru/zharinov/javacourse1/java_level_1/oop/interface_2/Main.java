package ru.zharinov.javacourse1.java_level_1.oop.interface_2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });
    }
}
