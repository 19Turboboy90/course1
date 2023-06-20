package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Создайте коллекцию случайных чисел (от 100 до 200) типа int размером 1000 элементов.

При помощи фильтра оставьте в коллекции только четные числа, которые делятся на 5 без остатка.

Преобразуйте данные так, чтобы в потоке вместо каждого из чисел был его квадратный корень. Тип данных должен измениться,
если раньше был Integer, то теперь будет лететь Double.

Преобразуйте полученные данные в строки: "Корень:____".

После этого соберите данные в List и выведите в консоль.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }

        List<String> result = numbers.stream()
                .filter(number -> number % 2 == 0 && number % 5 == 0)
                .map(Math::sqrt)
                .map(str -> "Sqrt: " + str)
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
