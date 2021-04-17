package lesson6;

import lesson6.Animal;
import lesson6.Cat;
import lesson6.Dog;

public class Lesson6 {

    public static void main (String [] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("просто дворняга");
        animals[1] = new Dog("еще дворняга");
        animals[2] = new Cat("Барсик");
        animals[3] = new Animal("Муж");
        int aCount = 0;
        int cCount = 0;
        int dCount = 0;
        for (Animal animal : animals) {
            animal.swim(900);
            animal.run(700);
            aCount++;
            if (animal instanceof Dog) {
                dCount++;
                return;
            }
            if (animal instanceof Cat) {
                cCount++;
            }
        }
        System.out.println(aCount + "/" + dCount + "/" + cCount);
    }
}
