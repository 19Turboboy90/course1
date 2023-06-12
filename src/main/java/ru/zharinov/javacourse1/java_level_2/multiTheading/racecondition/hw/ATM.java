package ru.zharinov.javacourse1.java_level_2.multiTheading.racecondition.hw;

public class ATM {
    private int balance = 10000;

    public double getBalance() {
        return balance;
    }

    public synchronized   void withdrawCash(String name, int money) {
        System.out.println(name + " подошел к банкомату");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (money <= balance) {
            balance -= money;
            System.out.println(name + " вывел " + money + " рублей");
            System.out.println("В банкомате осталось " + balance + " рублей");
        } else {
            System.out.println("В банкомате недостаточно денег для " + name);
        }
    }
}
