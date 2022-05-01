package com.geekbrains.lesson1.homework.participant;

public class Human implements Participant {

        private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 100;
    }

    @Override
    public int jump() {
        return 3;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
