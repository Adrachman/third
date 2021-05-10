package my.learn.hebrivore;

import my.learn.animal.Herbivore;
import my.learn.aviary.AviaryType;
import my.learn.interfaceAnimal.Swim;

public class Zebra extends Herbivore implements Swim {

    public void swim(){
        System.out.println("Zebra swimming");
    }

    @Override
    public AviaryType getAviaryType() {
        return AviaryType.MEDIUM;
    }

}
