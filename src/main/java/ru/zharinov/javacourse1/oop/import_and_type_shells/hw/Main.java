package ru.zharinov.javacourse1.oop.import_and_type_shells.hw;

/*
Создать класс Man (человек). Он содержит 4 поля: String имя, String должность, int возраст, double рост.
Все поля private, проинициализировать все поля в конструкторе.

В классе Main вам дана строка: "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист."
Необходимо распарсить строку, то есть вытащить из нее данные и сохранить в переменные.

Создать объект Man, в качестве параметров в конструктор передать данные, полученные из строки.

Вывести на экран все значения переменных (вам понадобятся геттеры)
 */
public class Main {
    public static void main(String[] args) {
        String text = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String name = text.substring(4, 8);
        String position = text.substring(53, text.length() - 1);
        int age = Integer.parseInt(text.substring(14, 16));
        double height = Double.parseDouble(text.substring(31, 37));
        Man man = new Man(name, position, age, height);
        System.out.println("Это " + man.getName() + ", ему " + man.getAge() + " года, его рост " +
                man.getHeight() + " см. Должность -" + man.getPosition() + ".");
    }
}
