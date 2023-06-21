package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw2;

import java.io.*;

/*
Создайте папку, а в ней файл.
Заполните его списком имен.
Прочитайте данные и выведите их в консоль.
*Использовать только латиницу.
 */
public class Main {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "Name.txt");
        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.println(result);
            long after = System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
