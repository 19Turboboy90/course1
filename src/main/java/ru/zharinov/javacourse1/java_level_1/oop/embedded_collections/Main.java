package ru.zharinov.javacourse1.java_level_1.oop.embedded_collections;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("Сергей");
//        employees.add("Кристина");
//        employees.add("Елена");
//        employees.add("Виктор");
//        employees.add("Наталья");
//        employees.remove(0);
//        employees.remove("Наталья");
////        for (String name : employees) {
////            System.out.println(name);
////        }
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add(i);
//        }
//        int sum = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//        System.out.println(sum);

//        HashSet<String> names = new HashSet<>();
//        names.add("Сергей");
//        names.add("Кристина");
//        names.add("Елена");
//        names.add("Виктор");
//        names.add("Наталья");
//        names.add("Наталья");
//        names.add(null);
//        names.add(null);
//        for (String i : names){
//            System.out.println(i);
//        }

        TreeSet<String> names = new TreeSet<>();
        names.add("Сергей");
        names.add("Кристина");
        names.add("Елена");
        names.add("Виктор");
        names.add("Наталья");
        names.add("Наталья");
        for (String i : names){
            System.out.println(i);
        }
    }
}
