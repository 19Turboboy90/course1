package ru.zharinov.javacourse1.java_level_2.streamApi.lambdaExpressions.hw2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Преобразовать данную коллекцию пользователей в поток данных и проделать следующие операции:

1. Отсортировать пользователей по их именам в алфавитном порядке

2. Оставить только пользователей младше 40 лет

3. Выбрать из них первых 3-х пользователей

4. Преобразовать в поток имен (то есть исходная коллекция у вас хранит объекты типа User со всей информацией о
пользователях, а на выходе должна получиться коллекция элементов типа String, в которой будут имена пользователей)

5. Используя метод forEach вывести в консоль все имена
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
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getAge() < 40)
                .limit(3)
                .map(user -> "Name: " + user.getName())
                .forEach(System.out::println);
    }
}
