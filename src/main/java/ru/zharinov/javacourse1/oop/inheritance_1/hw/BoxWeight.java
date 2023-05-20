package ru.zharinov.javacourse1.oop.inheritance_1.hw;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super(0);
        this.weight = 0;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Вес коробки: " + weight);
    }
}