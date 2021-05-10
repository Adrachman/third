package my.learn.worker;

import my.learn.animal.Animal;
import my.learn.aviary.WrongFoodException;
import my.learn.food.Food;
import my.learn.interfaceAnimal.Voice;

public class Worker {
    public void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        } catch (WrongFoodException e){
            System.out.println(e.getMessage());
        }
    }
    public void getVoice(Voice animal){
            System.out.println(((Voice) animal).voice());
    }
}
