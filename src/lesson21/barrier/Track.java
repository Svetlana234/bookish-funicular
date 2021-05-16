package lesson21.barrier;

import lesson21.AbstractBarrier;
import lesson21.RunAndJumpable;

/**
 * Беговая дорожка
 */
public class Track extends AbstractBarrier {

    public Track (int lenght) {
        this.size = lenght;
    }


    @Override
    public boolean applyBarrier(RunAndJumpable rj) {
        return rj.run(size);
    }
}
