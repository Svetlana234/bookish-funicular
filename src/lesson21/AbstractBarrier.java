package lesson21;

public abstract class AbstractBarrier {

    /**
     * Размер барьера
     */
    protected int size;

    /**
     * Абстрактный метод применения барьера к любому, кто умеет бегать и прыгать.
     * Метод возвращает признак, пройден барьер или нет
     * @param rj
     */
    public abstract boolean applyBarrier(RunAndJumpable rj);

}
