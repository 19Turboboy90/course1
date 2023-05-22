package ru.zharinov.javacourse1.java_level_1.syntaxjava.remainingtopics;

/*
Задача-1.

Создать строковый массив с названиями месяцев, проинициализировать сразу.
После этого вывести все названия месяцев в одну строчку и через запятую, а после последнего слова должна стоять точка.
 */
/*
Задача-2

Написать программу, которая принимает номер месяца и выводит его название на экран,
если такого месяца нет, то вывести надпись "месяц не существует".
 */
public class Space {
    public static void main(String[] args) {
        //Задача-1.
        //Мое решение
//        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Мая", "Июнь", "Июль",
//                "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//        for (int i = 0; i < month.length; i++) {
//            System.out.print(month[i]);
//            if (i == month.length - 1) {
//                System.out.print(".");
//            } else {
//                System.out.print(", ");
//            }
//        }
//        //решение автора
//        String[] namesOfMonth = {"Январь", "Февраль", "Март", "Апрель", "Мая", "Июнь", "Июль",
//                "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//        String result = "";
//        for (int i = 0; i < namesOfMonth.length; i++) {
//            result += namesOfMonth[i];
//            if (i == namesOfMonth.length - 1) {
//                result += ".";
//            } else {
//                result += ", ";
//            }
//        }
//        System.out.println(result);
        //Задача-2.

        int numberOfMonth = 1;
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Мая");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("месяц не существует");
                break;
        }
    }
}
