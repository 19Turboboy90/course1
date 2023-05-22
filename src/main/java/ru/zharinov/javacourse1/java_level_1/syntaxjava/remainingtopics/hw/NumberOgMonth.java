package ru.zharinov.javacourse1.java_level_1.syntaxjava.remainingtopics.hw;

/*
Написать программу, которая принимает строковую переменную с названием месяца. И если месяц введен правильно,
то вывести на экран время года, к которому этот месяц относится, в противном случае вывести сообщение, что месяц не существует.

Выполнить сначала при помощи if-else, а затем при помощи switch-case
 */
public class NumberOgMonth {
    public static void main(String[] args) {
        String nameOfMonth = "Май";
        switch (nameOfMonth) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца не существует");

        }
    }
}
