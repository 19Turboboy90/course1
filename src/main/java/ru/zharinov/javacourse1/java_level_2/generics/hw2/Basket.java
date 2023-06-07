package ru.zharinov.javacourse1.java_level_2.generics.hw2;


import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private List<T> basketFruits;

    public Basket() {
        this.basketFruits = new ArrayList<>();
    }

    public double getWeight() {
        double result = 0;
        for (T basketFruit : basketFruits) {
            result += basketFruit.getAllWeight();
        }
        return result;
    }

    public void add(T fruit) {
        basketFruits.add(fruit);
    }

    public int compare(Basket<? extends Fruit> basket) {
        return Double.compare(this.getWeight(), basket.getWeight());

    }

    public static <T extends Fruit> void transfer(Basket<? extends T> basket1, Basket<? super T> basket2) {
        basket2.basketFruits.addAll(basket1.basketFruits);
        basket1.basketFruits.clear();
    }
}
