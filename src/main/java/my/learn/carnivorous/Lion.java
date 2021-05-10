package my.learn.carnivorous;

import my.learn.animal.Carnivorous;
import my.learn.aviary.AviaryType;
import my.learn.interfaceAnimal.Run;
import my.learn.interfaceAnimal.Voice;

public class Lion extends Carnivorous implements Run, Voice {
    public void run() {
        System.out.println("Лев бегает");
    }

    public String voice() {
        return "Лев рычит";
    }

    public String eat() {
        return "eat";
    }

    @Override
    public AviaryType getAviaryType() {
        return AviaryType.LARGE;
    }
}
