package ru.zharinov.javacourse1.java_level_2.multiTheading.countDownLatch_executorService.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Используя экзекьютер сервис необходимо запустить на выполнение 3 задачи в отдельных потоках:

1 - посчитать и вывести в консоль сумму всех четных чисел от 0 до 1000000

2 - посчитать и вывести в консоль сумму всех чисел, которые без остатка делятся на 7 (так от 0 до 1000000)

3 - создать коллекцию из 1000 элементов. Заполнить ее случайными значения от 0 до 1000 и вывести в консоль количество
четных чисел в этой коллекции.

В главном потоке дождаться выполнения всех задач, используя CountDownLatch, замерить время их выполнения и вывести в
консоль результат. Сначала сделать это, создав пул из трех потоков, потом из одного и сравнить результат.
 */
public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        long before = System.currentTimeMillis();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("thread1 " + sum);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 7 == 0) {
                        sum += i;
                    }
                }
                System.out.println("thread2 " + sum);
                countDownLatch.countDown();
            }
        });

        executorService.execute(new Runnable() {
            final List<Integer> numbers = new ArrayList<>();
            @Override
            public void run() {
                int count = 0;
                for (int i = 0; i < 1000; i++) {
                    numbers.add((int) (Math.random() * 1000));
                }
                for (int num : numbers) {
                    if (num % 2 == 0) {
                        count++;
                    }
                }
                System.out.println("thread3 " + count);
                countDownLatch.countDown();
            }
        });
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long after = System.currentTimeMillis();
        System.out.println("Time: " + (after - before));
    }
}
