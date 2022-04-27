package com.geekbrains.lesson1.homework.obstacles;

import com.geekbrains.lesson1.homework.participant.Participant;

public class Wall implements Obstacle{

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacle(Participant participant) {

        if (participant.jump() > height) {
            System.out.printf("Участник %s успешно перепрыгнул через стену высотой %d %n",participant,height);
            return true;
        }
        System.out.printf("Участник %s НЕ СМОГ ПЕРЕПРЫГНУТЬ через стену высотой %d %n",participant,height);
        return false;
    }

}
