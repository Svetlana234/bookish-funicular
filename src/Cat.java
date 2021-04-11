/**
 * Кошка
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void swim (int distance) {
        System.out.println("Кот утонул сразу.");
    }

    /**
     * Бежать
     * @param distance
     */
    protected void run (int distance) {
        if (distance >500) {
            distance = 500;
        }
        System.out.println("Кот " + name + " пробежал: " + distance + " метров.");
    }
}
