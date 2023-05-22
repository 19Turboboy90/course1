package ru.zharinov.javacourse1.java_level_1.oop.inheritance_1;

public class Cat extends CatFamily {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
