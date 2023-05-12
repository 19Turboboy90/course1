package ru.zharinov.javacourse1.oop.parameterized_methods;

public class Box {
    double height;
    double width;
    double length;

    void setDimes(double width, double length, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double volume () {
        return width * height * length;
    }
}
