package lesson21.rj;

import lesson21.RunAndJumpable;

/**
 * Робот умеет бегать и прыгать
 */
public class Robot implements RunAndJumpable {

    private int lenght = 1;

    @Override
    public boolean run(int lenght) {
        return lenght <= this.lenght;
    }

    @Override
    public boolean jump(int height) {
        return false;
    }
}
