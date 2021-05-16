package lesson21.rj;

import lesson21.RunAndJumpable;

/**
 * Человек умеет бегать и прыгать
 */
public class Human implements RunAndJumpable {

    private int lenght = 2;

    private int height = 1;

    @Override
    public boolean run(int lenght) {
        return lenght <= this.lenght;
    }

    @Override
    public boolean jump(int height) {
        return height <= this.height;
    }


}
