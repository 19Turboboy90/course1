package ru.zharinov.javacourse1.java_level_2.inputOutputStreams;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2/folder3");
        File file = new File(directory, "A.txt");
        File file1 = new File("");
        System.out.println(file.getAbsoluteFile());


        try {
//            directory.mkdirs();
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isFile());
    }
}
