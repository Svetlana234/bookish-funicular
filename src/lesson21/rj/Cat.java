package lesson21.rj;

import lesson21.RunAndJumpable;

/**
 * Кот умеет бегать и прыгать
 */
public class Cat implements RunAndJumpable {

    private int lenght = 2;

    private int height = 2;

    @Override
    public boolean run(int lenght) {
        return lenght <= this.lenght;
    }

    @Override
    public boolean jump(int height) {
        return height <= this.height;
    }
}
