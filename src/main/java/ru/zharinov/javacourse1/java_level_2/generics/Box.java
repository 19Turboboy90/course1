package ru.zharinov.javacourse1.java_level_2.generics;

import java.util.List;

public class Box<T extends Number & Comparable<T>> {
    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<?> another) {
        return Double.compare(avg(), another.avg());
    }

    public static <U> void transfer(List<? extends U> src, List<? super U> dst) {
        dst.addAll(src);
        src.clear();
    }
}
