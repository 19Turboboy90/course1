package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw5;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
1. Создать текстовый документ большого объема.

2. Напишите программу, которая запрашивает номер страницы, вы ее вводите в консоль, и у вас выводится текст с этой
странице.

3. При вводе слова "стоп" программа завершается.

Считайте, что на одной странице 3000 байт.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Family/Desktop/start.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter the page number: ");
            String page = console.nextLine();
            byte[] array = new byte[3000];
            while (!page.equals("stop")) {
                if (Integer.parseInt(page) == 1) {
                    randomAccessFile.seek(Integer.parseInt(page));
                } else {
                    randomAccessFile.seek(Integer.parseInt(page) + array.length);
                }
                int count = randomAccessFile.read(array);
                System.out.println(new String(array, 0, count));
                System.out.print("Enter the page number: ");
                page = console.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
