package ru.zharinov.javacourse1.syntaxjava.variables.hw;

/*
Создать новый класс, в котором вы вводите количество секунд,
а программа выводит в консоль, сколько это дней, часов, минут и секунд.
 */
public class Time {
    public static void main(String[] args) {
        int seconds = 1000000;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int days = seconds / secondsInHours / 24;
        int hours = (seconds / secondsInHours) % 24;
        int minutes = (seconds % secondsInHours) / secondsInMinutes;
        int leftSeconds = (seconds % secondsInHours) % secondsInMinutes;
        System.out.println("Общее кол-во секунд: " + seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);
    }
}
