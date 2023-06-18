package ru.zharinov.javacourse1.java_level_2.multiTheading.blockingQueue.hw;

/*
Создать 3 потока, каждый из них выводит 5 раз одну букву.
Первый поток выводит 5 раз А, второй В, третий 5 раз С.

Нужно настроить работу потоков таким образом, чтобы после запуска всех 3-х в консоли было выведено "АВСАВСАВСАВСАВС".
То есть 1-ый печатает одну букву, потом второй одну, потом третий и заново до тех пор, пока не будет 5 раз надпись АВС.
Не нужно использовать sleep и join, вам понадобятся методы wait и notifyAll.
 */
public class Main {
    private static final Object MONITOR = new Object();
    private static String nextLetter = "A";

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals("A")) {
                                MONITOR.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("A");
                        nextLetter = "B";
                        MONITOR.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals("B")) {
                                MONITOR.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("B");
                        nextLetter = "C";
                        MONITOR.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals("C")) {
                                MONITOR.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("C");
                        nextLetter = "A";
                        MONITOR.notifyAll();
                    }
                }
            }
        }).start();
    }
}
