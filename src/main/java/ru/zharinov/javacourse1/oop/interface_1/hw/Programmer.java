package ru.zharinov.javacourse1.oop.interface_1.hw;

public class Programmer extends Employee implements CodeWritable {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Писать код");
    }
}
