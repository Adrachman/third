package my.learn.animal;

import my.learn.aviary.AviaryType;
import my.learn.aviary.WrongFoodException;
import my.learn.food.Food;

import java.util.Objects;

public abstract class Animal {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("run");
    }

    public void eat(Food food) throws WrongFoodException {
        System.out.println("Есть еду");
    }

    public abstract AviaryType getAviaryType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
