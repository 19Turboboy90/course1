package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.randomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Family/Desktop/end.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
//            randomAccessFile.seek(10);
//            randomAccessFile.writeBytes("**************************************");
            randomAccessFile.seek(100);
            byte[] array = new byte[1024];
            randomAccessFile.read(array);
            System.out.println(new String(array));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
