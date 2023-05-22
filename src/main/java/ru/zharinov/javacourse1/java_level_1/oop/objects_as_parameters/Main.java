package ru.zharinov.javacourse1.java_level_1.oop.objects_as_parameters;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = box1.increase(3);
        System.out.println(box1.volume());
        System.out.println(box2.volume());
        int result = box1.compareBox(box2);
        switch (result) {
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            default:
                System.out.println("Коробки равны");
        }
    }
}
