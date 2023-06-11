package ru.zharinov.javacourse1.java_level_2.multiTheading.hw1;

import java.util.Arrays;

/*
Создать 2 метода withConcurrency и withoutConcurrency, которые делают следующее:

1. Создают массив объектов типа float большого размера(10млн+).
2. Заполняют этот массив единицами.
3. Сохраняют время перед выполнением расчета.
4. В цикле считают новое значение для каждого элемента по формуле:
arr[i] = (float)(arr[i]*Math.sin(0/2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(o/4 + i / 2));
5. Сохраняют время после выполнения расчета.
6. В консоль выводят время выполнения расчета.

Метод withoutConcurrency - не использует многопоточность. Он выполняет все действия в главном потоке.

Метод withConcurrency - использует многопоточность. Перед выполнением расчетов он разбивает исходный массив на два при
помощи метода System.arrayCopy, в отдельных потоках считает новые значения для каждого массива и потом склеивает их
обратно при помощи System.arrayCopy.

Время выполнения метода withConcurrency должно включать в себя не только расчет, но и время на разбивку и склейку массива.
 */
public class Main {
    private static final int SIZE = 10_000_000;

    public static void main(String[] args) {
        withoutConcurrency();
        withConcurrency();
    }

    private static void withoutConcurrency() {
        float[] bigArray = new float[SIZE];
        Arrays.fill(bigArray, 1);
        long before = System.currentTimeMillis();
        for (int i = 0; i < bigArray.length; i++) {
            float n = (float) i;
            bigArray[i] = (float) (bigArray[i] * Math.sin(0.2f + n / 5) * Math.cos(0.2f + n / 5) * Math.cos(0.4 + n / 2));
        }
        long after = System.currentTimeMillis();
        System.out.println("withoutConcurrency " + (after - before));

    }

    private static void withConcurrency() {
        float[] bigArray = new float[SIZE];
        float[] array1 = new float[SIZE / 2];
        float[] array2 = new float[SIZE / 2];
        Arrays.fill(bigArray, 1);
        long before = System.currentTimeMillis();
        System.arraycopy(bigArray, 0, array1, 0, array1.length);
        System.arraycopy(bigArray, bigArray.length / 2, array2, 0, array2.length);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < array1.length; j++) {
                    float n = (float) j;
                    array1[j] = (float) (bigArray[j] * Math.sin(0.2f + n / 5) * Math.cos(0.2f + n / 5) * Math.cos(0.4 + n / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < array2.length; j++) {
                    float n = (float) (j + SIZE / 2);
                    array2[j] = (float) (bigArray[j] * Math.sin(0.2f + n / 5) * Math.cos(0.2f + n / 5) * Math.cos(0.4 + n / 2));
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(array1, 0, bigArray, 0, bigArray.length / 2);
        System.arraycopy(array2, 0, bigArray, bigArray.length / 2, bigArray.length / 2);
        long after = System.currentTimeMillis();
        System.out.println("withConcurrency " + (after - before));
    }
}
