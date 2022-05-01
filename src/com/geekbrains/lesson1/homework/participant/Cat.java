package com.geekbrains.lesson1.homework.participant;

public class Cat implements Participant {

        private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 20;
    }

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
