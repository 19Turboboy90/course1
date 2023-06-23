package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw4;

import java.io.*;
import java.util.Scanner;

/*
Написать программу, которая работает следующим образом:

1. При запуске запрашивает имя.

2. После ввода имени запрашивает его снова до тех пор, пока не будет введено слово "Выход".

3. После того как будет введено имя, его нужно сохранить в файл. Необходимо дополнять уже существующий файл, а не
перезаписывать его каждый раз.

4. После завершения ввода (когда будет введено "Выход") необходимо вывести в консоль все сохраненные имена.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Family/Desktop/end.txt");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the name: ");
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true));
             InputStream fileInputStream = new BufferedInputStream(new FileInputStream(file))) {
            String name;
            while (!(name = console.nextLine()).equals("Exit")) {
                System.out.print("Enter the name: ");
                outputStream.write(name.getBytes());
                outputStream.write("\n".getBytes());
            }
            int a = fileInputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = fileInputStream.read();
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
