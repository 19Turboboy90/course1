package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/*
1. Создать файл с именами. Все имена должны быть написаны в одну строку и между именами должен быть только пробел.

2. Прочитайте их и соберите в одну строку, используя Reader и чтение в массив.

3. Полученную строку преобразуйте в массив имен. Используйте метод split из класса String.

4. Преобразуйте массив в stream, отфильтруйте, оставив только имена, которые начинаются с буквы А.

5. Выведите в консоль результат.
 */
public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "Name.txt");

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] array = new char[1024];
            int count = reader.read(array);
            StringBuilder stringBuilder = new StringBuilder();
            while (count > 0) {
                stringBuilder.append(new String(array, 0, count));
                count = reader.read(array);
            }
            String[] result = stringBuilder.toString().split(" ");
            Arrays.stream(result)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
