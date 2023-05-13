package ru.zharinov.javacourse1.oop.objects_as_parameters.hw;

import ru.zharinov.javacourse1.oop.objects_as_parameters.Box;

/*
В классе Box создать метод, который принимает в качестве параметра объект box, и возвращает новую коробку.
У которой все размеры равны: размеры вызывающего объекта + размеры переданного объекта.

Создать конструктор, который принимает 2 коробки. С помощью этого конструктора можно будет создать объект,
который по объему больше чем 2 переданные коробки вместе взятые.

Продемонстрировать работу метода и конструктора в классе Main в методе main()
 */
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10);
        Box box3 = new Box(box1, box2);
        box3.showVolume();
        Box newBox = box1.newBox(box2);
        newBox.showVolume();
    }
}
