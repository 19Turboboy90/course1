package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
1. Создайте класс Cat, у которого будут поля - кличка, порода и вес
2. В классе Main создайте коллекцию котов, добавьте несколько экземпляров.
3. Сохраните эту коллекцию в новый файл.
4. Получите коллекцию из файла и в цикле for each выведите имена всех котов в консоль.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Family/Desktop/end.txt");
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("barsik", "pers", 5));
        cats.add(new Cat("vasika", "british", 10.1));
        cats.add(new Cat("murzik", "russian", 8.1));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            outputStream.writeObject(cats);

            List<Cat> newCatList = (List<Cat>) objectInputStream.readObject();

            for (Cat cat : newCatList) {
                System.out.println(cat);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
