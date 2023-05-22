package ru.zharinov.javacourse1.java_level_1.advanced_level.exception_handling;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            String s = "12asdasd";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NumberFormatException e1){
            System.out.println("Ошибка преобразования");
        }

        System.out.println("Привет");
    }
}
