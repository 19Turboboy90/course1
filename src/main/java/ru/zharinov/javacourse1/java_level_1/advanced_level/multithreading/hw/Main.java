package ru.zharinov.javacourse1.java_level_1.advanced_level.multithreading.hw;

/*
В главном потоке создать переменную int, которой присваивается случайное значение от 0 до 1000000,
после этого создайте два потока, один будет в роли таймера выводить числа по порядку каждую секунду.
А второй поток будет пытаться угадать случайное число, причем не перечисляя все числа подряд, а тоже генерируя случайные
числа. Когда поток угадает число, таймер должен остановиться, а загаданное число появиться на экране.
 */
public class Main {
    private static boolean isWin = true;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000);
        System.out.println("Загаданное число: " + random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 1;
                    while (isWin) {
                        System.out.println(i);
                        Thread.sleep(1000);
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timer.start();

        Thread randomNumber = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isWin) {
                    int result = (int) (Math.random() * 1000000);
                    if (random == result) {
                        isWin = false;
                        System.out.println("Угаданное число: " + result);
                    }
                }
            }
        });
        randomNumber.start();
    }
}
