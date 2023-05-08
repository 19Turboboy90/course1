package ru.zharinov.javacourse1.syntaxjava.loop.hw;

/*
Вывести все нечетные числа от 100 до 1000, которые делятся без остатка на 5
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
