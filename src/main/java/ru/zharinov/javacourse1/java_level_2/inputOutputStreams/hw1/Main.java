package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw1;

import java.io.File;
import java.io.IOException;

/*
Создать иерархию папок: Папка1/Папка2/Папка3.

В папке 3 создать несколько файлов с разными именами.

Вывести в консоль абсолютные пути файлов, имена которых начинаются на А.
 */
public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2/folder3");
        File file1 = new File(directory, "ABC.txt");
        File file2 = new File(directory, "BBB.txt");
        File file3 = new File(directory, "CCC.txt");
        File file4 = new File(directory, "CBA.txt");

        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] files = directory.listFiles((dir, name) -> name.startsWith("A"));
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
