package ru.zharinov.javacourse1.java_level_1.syntaxjava.conditionaloperators.temp;

public class Temp {
    public static void main(String[] args) {
        int temp = 20;
        if (temp > 25) {
            System.out.println("Кондиционер включен");
        } else if (temp < 22) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }
    }
}
