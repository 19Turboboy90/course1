package ru.zharinov.javacourse1.syntaxjava.variables;

public class IntegerManipulations {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        c = c + 5;
        c += 5;
        c = c * 10;
        c *= 10;
        a = 10;
        b = 3;
        c = a % b;

        System.out.println("c = " + c);
    }
}
