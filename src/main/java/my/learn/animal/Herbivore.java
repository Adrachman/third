package my.learn.animal;
// Травоядные


import my.learn.aviary.WrongFoodException;
import my.learn.food.Food;
import my.learn.food.Grass;

public abstract class Herbivore extends Animal {
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Данное животное ест траву");
        } else
            throw new WrongFoodException("Данная еда не подходит животному");
    }
}
