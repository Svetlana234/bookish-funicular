package lesson6;

/**
 * Суперкласс для всех типов животных
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * Плавать
     * @param distance
     */
    protected void swim (int distance) {
        System.out.println("Животное проплыло: " + distance + " метров.");
    }

    /**
     * Бежать
     * @param distance
     */
    protected void run (int distance) {
        System.out.println("Животное пробежало: " + distance + " метров.");
    }
}
