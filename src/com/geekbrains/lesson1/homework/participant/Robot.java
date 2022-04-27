package com.geekbrains.lesson1.homework.participant;

public class Robot implements Participant {

        private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 550;
    }

    @Override
    public int jump() {
        return 50;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
