package ru.zharinov.javacourse1.java_level_2.multiTheading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print(i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("N");
        }
        System.out.println("\nFinish");
    }
}
