package ru.zharinov.javacourse1.oop.constructors;

public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimes(double width, double length, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double volume () {
        return width * height * length;
    }
}
