package ru.zharinov.javacourse1.syntaxjava.loop;

/*
Задача-1.
Вывести все числа от 1 до 1000, каждое с новой строки
 */

/*
Задача-2.
Вывести все четные числа от 1000 до 0
 */
/*
Задача-3
Посчитать среднее арифметическое всех чисел от 0 до 100
 */
public class Loop {
    public static void main(String[] args) {
        //----------------------------While----------------------------
//        //Задача-1
//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//        }
//        //Задача-2
//        int i = 1000;
//        while (i >= 0) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        }
//        //Задача-3
//        int count = 1;
//        int sum = 0;
//        while (count <= 100) {
//            sum += count;
//            count++;
//        }
//        float result = sum / (float) count;
//        System.out.println(result);
        //----------------------------Do While----------------------------
//        int a = 0;
//        do {
//            System.out.println("Привет");
//        } while (a > 0);
        //----------------------------For----------------------------
        for (int i = 1000; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
