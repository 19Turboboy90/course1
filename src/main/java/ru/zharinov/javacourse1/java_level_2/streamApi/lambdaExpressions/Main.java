package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
    }
}
