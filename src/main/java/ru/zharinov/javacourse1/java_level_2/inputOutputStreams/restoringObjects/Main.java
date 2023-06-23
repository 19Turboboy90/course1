package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.restoringObjects;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Family/Desktop/end.txt");
        User user = new User("John", "Smith", 25, new Address("Main", 10));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            User savedUser = (User)objectInputStream.readObject();
            System.out.println(savedUser);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
