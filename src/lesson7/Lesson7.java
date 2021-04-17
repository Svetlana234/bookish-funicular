package lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Голодный", 35);
        cats[1] = new Cat("Любимый", 25);
        cats[2] = new Cat("Рыжий", 30);
        cats[3] = new Cat("Муж", 30);
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
            if (! cat.satiety) {
                plate.increaseFood(100);
                cat.eat(plate);
            }
            plate.info();
        }

    }

}
