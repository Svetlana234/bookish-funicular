package lesson6;

import lesson6.Animal;

/**
 * Собака
 */
public class Dog  extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void swim (int distance) {
        if (distance >10) {
            distance = 10;
        }
        System.out.println("Собака проплыла: " + distance + " метров.");
    }

    /**
     * Бежать
     * @param distance
     */
    protected void run (int distance) {
        if (distance >500) {
            distance = 500;
        }
        System.out.println("Собака пробежала: " + distance + " метров.");
    }
}
