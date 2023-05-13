package ru.zharinov.javacourse1.oop.method_overloading.hw;

public class Monster {
    int eye;
    int leg;
    int arm;

    public Monster() {
        eye = 2;
        leg = 2;
        arm = 2;
    }

    public Monster(int eye) {
        this.eye = eye;
        this.leg = 2;
        this.arm = 2;
    }

    public Monster(int eye, int arm) {
        this.eye = eye;
        this.arm = arm;
        this.leg = 2;
    }

    public Monster(int eye, int leg, int arm) {
        this.eye = eye;
        this.leg = leg;
        this.arm = arm;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }

    void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
}
