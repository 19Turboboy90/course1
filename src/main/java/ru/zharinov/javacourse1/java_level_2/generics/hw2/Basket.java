package ru.zharinov.javacourse1.java_level_2.generics.hw2;


import java.util.ArrayList;
import java.util.List;

public class Basket<B extends Fruit> {
    private List<B> basketFruits;

    public Basket() {
        this.basketFruits = new ArrayList<>();
    }

    public double getWeight() {
        double result = 0;
        for (B basketFruit : basketFruits) {
            result += basketFruit.getAllWeight();
        }
        return result;
    }

    public void add(B fruit) {
        basketFruits.add(fruit);
    }

    public int compare(Basket<? extends Fruit> basket) {
        if (this.getWeight() > basket.getWeight()) {
            return 1;
        } else if (this.getWeight() == basket.getWeight()) {
            return 0;
        }
        return -1;
    }

    public static <B extends Fruit> void transfer(Basket<B> basket1, Basket<? super B> basket2) {
        basket2.basketFruits.addAll(basket1.basketFruits);
        basket1.basketFruits.clear();
    }
}
