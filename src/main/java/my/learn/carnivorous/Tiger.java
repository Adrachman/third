package my.learn.carnivorous;

import my.learn.animal.Carnivorous;
import my.learn.aviary.AviaryType;
import my.learn.interfaceAnimal.Run;
import my.learn.interfaceAnimal.Swim;
import my.learn.interfaceAnimal.Voice;

public class Tiger extends Carnivorous implements Run, Voice, Swim {

    public void swim() {
        System.out.println("tiger swimming");
    }

    public void run() {
        System.out.println("Тигр бегает");
    }

    public String voice() {
        return "Тигр рычит";
    }

    public String eat() {
        return "I am Tiger, and eat meet";
    }

    @Override
    public AviaryType getAviaryType() {
        return AviaryType.LARGE;
    }
}
