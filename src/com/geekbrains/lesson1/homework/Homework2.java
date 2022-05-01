package com.geekbrains.lesson1.homework;

import com.geekbrains.lesson1.homework.obstacles.Obstacle;
import com.geekbrains.lesson1.homework.obstacles.Track;
import com.geekbrains.lesson1.homework.obstacles.Wall;
import com.geekbrains.lesson1.homework.participant.Cat;
import com.geekbrains.lesson1.homework.participant.Human;
import com.geekbrains.lesson1.homework.participant.Participant;
import com.geekbrains.lesson1.homework.participant.Robot;

public class Homework2 {

    public static void main(String[] args) {
        Human human = new Human("Alex");
        Cat cat = new Cat("Zhulik");
        Robot robot = new Robot("Robot");

        Track track = new Track(150);
        Wall wall = new Wall(15);

        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {track, wall};
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
              if (!obstacle.passObstacle(participant)){
                  System.out.printf("Участник %s ВЫБЫВАЕТ из соревнований %n", participant);
                 break;
              }
            }
        }
    }
}
