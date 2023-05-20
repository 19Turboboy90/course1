package ru.zharinov.javacourse1.oop.interface_2;

public class Cooker implements Cookable{
    @Override
    public void cook() {
        System.out.println("Готовлю");
    }
}
