package ru.zharinov.javacourse1.syntaxjava.arrays.hw;

/*
Создать массив чисел, и проинициализировать его значениями от 100 до 1000

Создать второй массив по длине равный первому (использовать свойство length).
Проинициализировать его значениями, взятыми из первого массива, но в обратном порядке.
В цикле for each вывести все элементы второго массива.
 */
public class WorkingWithArray {
    public static void main(String[] args) {
        int[] firstArray = new int[900];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 100;
        }
        int[] secondArray = new int[firstArray.length];
        for (int i = 0, j = firstArray.length - 1; i < secondArray.length; i++, j--) {
            secondArray[i] = firstArray[j];
        }
        for (int i : secondArray) {
            System.out.println(i);
        }
    }
}
