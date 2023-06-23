package ru.zharinov.javacourse1.java_level_2.inputOutputStreams.hw6;

import java.io.Serializable;

public class Cat implements Serializable {
    private String nickname;
    private String breed;
    private double weight;

    public Cat(String nickname, String bred, double weight) {
        this.nickname = nickname;
        this.breed = bred;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
