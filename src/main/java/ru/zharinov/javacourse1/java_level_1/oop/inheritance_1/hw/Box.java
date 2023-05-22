package ru.zharinov.javacourse1.java_level_1.oop.inheritance_1.hw;

public class Box {
    double width;
    double height;
    double length;

    public Box() {
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        this.width = size;
        this.height = size;
        this.length = size;
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    public void showInfo() {
        System.out.print("Ширина коробки: " + width + " Высота коробки: " + height + " Длина коробки: " + length);
    }
}
