package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions.hw3;

import java.util.ArrayList;
import java.util.List;

/*
Из списка используя stream Api.
1. найти метод, который возвращает первый элемент из потока типа Optional.
2. найти пользователя чье имя содержат имя "L", и если такой пользователь есть вывести информацию о нем в консоль,
а если нет, то вывести строку "User not found"
 */
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        users.stream()
                .filter(user -> user.getName().toLowerCase().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("user not found"));
    }
}
