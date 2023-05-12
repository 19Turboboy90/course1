package ru.zharinov.javacourse1.oop.parameterized_methods.hw;

public class Rect {
    double length;
    double wight;

    void setRect(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    double perimeter() {
        return 2 * (length + wight);
    }

    double square() {
        return length * wight;
    }
}
