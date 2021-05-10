package my.learn.animal;
//Хищные


import my.learn.aviary.WrongFoodException;
import my.learn.food.Food;
import my.learn.food.Meat;

public abstract class Carnivorous extends Animal {
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Данное животное ест мясо");
        } else
            throw new WrongFoodException("Данная еда не подходит животному");
    }
}
