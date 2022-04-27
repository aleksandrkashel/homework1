package com.geekbrains.lesson1.homework.obstacles;

import com.geekbrains.lesson1.homework.participant.Participant;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (participant.run() > length) {
            System.out.printf("Участник %s успешно пробежал по дорожке %d метров %n",participant,length);
            return true;
        }
        System.out.printf("Участник %s НЕ СМОГ ПРОБЕЖАТЬ по дорожке %d м %n",participant,length);
        return false;
    }
}
