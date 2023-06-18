package ru.zharinov.javacourse1.java_level_2.multiTheading.deadlock.hw;

public class MFP {
    private final Object printMonitor = new Object();
    private final Object scanMonitor = new Object();

    public void print(int count) {
        synchronized (printMonitor) {
            try {
                for (int i = 1; i <= count; i++) {
                    Thread.sleep(1000);
                    System.out.println("Scanned " + i + "pages.");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void scan(int count) {
        synchronized (scanMonitor) {
            try {
                for (int i = 1; i <= count; i++) {
                    Thread.sleep(1000);
                    System.out.println("Printed " + i + "pages");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
