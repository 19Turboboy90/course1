package ru.zharinov.javacourse1.java_level_1.oop.interface_2.hw;

public class MyCounter implements Counter {
    @Override
    public String report(int i) {
        return "Отчет за " + i + " месяцев ";
    }
}
