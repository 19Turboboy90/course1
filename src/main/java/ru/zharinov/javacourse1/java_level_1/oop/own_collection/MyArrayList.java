package ru.zharinov.javacourse1.java_level_1.oop.own_collection;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) {
                remove(i);
                break;
            }
        }
    }

    public String get(int index) {
        if (index >= 0) {
            return array[index];
        } else {
            return "Объект не найден";
        }
    }

    public int getSize() {
        return size;
    }
}
