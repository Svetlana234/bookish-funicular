package lesson21;

import lesson21.barrier.Track;
import lesson21.barrier.Wall;
import lesson21.rj.Cat;
import lesson21.rj.Human;
import lesson21.rj.Robot;

public class Lesson21 {

    public static void main (String [] args) {
        AbstractBarrier barriers [] = new AbstractBarrier[4];
        barriers[0] = new Track(1);
        barriers[1] = new Wall(1);
        barriers[2] = new Track(2);
        barriers[3] = new Wall(2);
        Course course = new Course(barriers);
        Team team = new Team("We are the champions!"
                , new Cat(), new Robot(), new Human(), new Cat());
        team.teamInfo();
        team.goGoGo(course);
    }
}
