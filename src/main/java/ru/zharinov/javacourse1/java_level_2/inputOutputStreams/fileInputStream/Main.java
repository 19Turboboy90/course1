package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.fileInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "folder";
        File file = new File(path, "1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            int read = inputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = inputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
