package ru.zharinov.javacourse1.oop.inheritance_1;

public class Leon extends CatFamily {
    public Leon() {
        super(2, 4, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
