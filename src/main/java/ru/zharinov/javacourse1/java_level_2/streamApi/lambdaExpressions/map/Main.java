package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        List<String> filtered = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> "Number: " + n)
                .filter(n -> n.endsWith("0"))
                .map(n -> n + "!")
                .collect(Collectors.toList());


        List<String> mapped = map(numbers);
        for (String s : filtered) {
            System.out.println(s);
        }
    }

    private static List<String> map(List<Integer> list) {
        List<String> result = new ArrayList<>();
        for (int i : list) {
            result.add("Number: " + i);
        }
        return result;
    }
}
