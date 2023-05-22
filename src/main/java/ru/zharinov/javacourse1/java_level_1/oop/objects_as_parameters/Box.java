package ru.zharinov.javacourse1.java_level_1.oop.objects_as_parameters;

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

    public Box(Box box) {
        this(box.width, box.height, box.length);
    }

    public Box(Box box1, Box box2) {
        this.width = box1.width * box2.width;
        this.height = box1.height * box2.height;
        this.length = box1.length * box2.length;
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public int compareBox(Box box) {
        double thisVolume = box.volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            return 1;
        } else if (thisVolume < boxVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    public Box newBox(Box box) {
        double newLength = length + box.length;
        double newWidth = width + box.width;
        double newHeight = height + box.height;
        return new Box(newWidth, newHeight, newLength);
    }
}
