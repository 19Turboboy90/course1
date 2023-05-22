package ru.zharinov.javacourse1.java_level_1.advanced_level.exception_handling.hw;

/*
Создать исключительную ситуацию, при которой будет брошено исключение IndexOutOfBoundException, выход за пределы массива.

Обработайте ее в блоке try catch и выведете сообщение "Выход за пределы массива"
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 10; i++) {
                array[i] = i;
                System.out.print(array[i] + ", ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

    }
}
