package lesson21.barrier;

import lesson21.AbstractBarrier;
import lesson21.RunAndJumpable;

/**
 * Стена
 */
public class Wall extends AbstractBarrier {

    public Wall (int height) {
        this.size = height;
    }

    @Override
    public boolean applyBarrier(RunAndJumpable rj) {
        return rj.jump(this.size);
    }
}
