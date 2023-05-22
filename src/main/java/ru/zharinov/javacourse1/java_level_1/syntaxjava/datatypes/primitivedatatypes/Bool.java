package ru.zharinov.javacourse1.java_level_1.syntaxjava.datatypes.primitivedatatypes;

public class Bool {
    public static void main(String[] args) {
        int temp = 40;
        int time = 24;
        boolean late = time >= 23;
        boolean hot = temp > 25;
        if (!hot || late) {
            System.out.println("Кондиционер выключен");
        }
    }
}