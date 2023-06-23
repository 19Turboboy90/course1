package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.fileOutputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Family\\Desktop\\start.txt");
//        try (OutputStream outputStream = new FileOutputStream(file,true)) {
//            String names = "Alex Max John Andrew Jack Nick Alice Helen";
//            outputStream.write(names.getBytes());
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            long after = System.currentTimeMillis();
            System.out.println("\n" + (after - before));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
