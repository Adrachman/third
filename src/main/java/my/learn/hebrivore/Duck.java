package my.learn.hebrivore;

import my.learn.animal.Herbivore;
import my.learn.aviary.AviaryType;
import my.learn.interfaceAnimal.Fly;
import my.learn.interfaceAnimal.Run;
import my.learn.interfaceAnimal.Swim;
import my.learn.interfaceAnimal.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public String voice() {
        return "Утка кричит Кря-кря";
    }

    public void swim() {
        System.out.println("Утка плавает");
    }

    public void flying() {
        System.out.println("Утка летает махая крылья");
    }

    public void run() {
        System.out.println("Утка бегат");
    }

    public String eat() {
        return "Duck eat grass";
    }

    @Override
    public AviaryType getAviaryType() {
        return AviaryType.SMALL;
    }
}
