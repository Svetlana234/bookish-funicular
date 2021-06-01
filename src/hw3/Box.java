package hw3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList <T> fruitsList = new ArrayList<>();

    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }
     public void  addFruit(T fruit) {
         fruitsList.add(fruit);
     }

     public float getBoxWeit() {
        return fruitsList.size() * fruitsList.get(0).weigt;
    }
        public boolean compare(Box<?> box) {
          return getBoxWeit() == box.getBoxWeit();
    }
         public void transferFruits(Box<T>box) {
         fruitsList.addAll(box.fruitsList);
             box.fruitsList.clear();


    }
}




