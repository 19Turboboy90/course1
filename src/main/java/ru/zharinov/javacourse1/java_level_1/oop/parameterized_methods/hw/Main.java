package ru.zharinov.javacourse1.java_level_1.oop.parameterized_methods.hw;

/*
Создать класс Rect(прямоугольник), в котором будет 2 поля - длина и ширина. Объявить 3 метода:

1) Метод, который принимает 2 параметра - длина и ширина, и устанавливает их у нашего прямоугольника.
2) Метод без параметров - возвращает периметр прямоугольника.
3) Метод без параметров - возвращает площадь прямоугольника.

Продемонстрировать работу методов в классе Main.
 */
public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setRect(10, 10);
        System.out.println("Периметр прямоугольника = " + rect.perimeter());
        System.out.println("Площадь прямоугольника = " + rect.square());
    }
}
