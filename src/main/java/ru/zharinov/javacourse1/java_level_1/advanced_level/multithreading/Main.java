package ru.zharinov.javacourse1.java_level_1.advanced_level.multithreading;

public class Main {
    private static boolean isFive = false;

    public static void main(String[] args) {

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (true) {
                        if (i == 5) {
                            isFive = true;
                        }
                        System.out.println(i);
                        Thread.sleep(1000);
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }
        });
        timer.start();

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (isFive) {
                        System.out.println(i);
                        Thread.sleep(1000);
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }
        });
        timer2.start();
    }
}
