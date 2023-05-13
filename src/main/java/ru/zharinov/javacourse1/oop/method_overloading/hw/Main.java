package ru.zharinov.javacourse1.oop.method_overloading.hw;

/*
Создать класс Монстр, с 3-мя полями типа int (кол-во глаз, ног и рук).
Создать 4 конструктора (пустой, с 1-им параметром, 2-мя и 3-мя). Если в параметрах конструктора не устанавливается
какое-то значение, то установить его равным 2.

Создать методы
void voice(), который выводит на экран слово "Голос".
void voice(int i), выводит слово голос I раз
void voice(int i, String word), выводит слово word I раз.
 */
public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.voice();
        monster.voice(4, "Привет");
        monster.voice(4);
    }
}
