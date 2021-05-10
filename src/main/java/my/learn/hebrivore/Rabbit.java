package my.learn.hebrivore;

import my.learn.animal.Herbivore;
import my.learn.aviary.AviaryType;
import my.learn.interfaceAnimal.Run;

public class Rabbit extends Herbivore implements Run {

    public void run(){
        System.out.println("Кролик бегает");
    }

    public String eat(){
        return "Rabbit eat grass";
    }


    @Override
    public AviaryType getAviaryType() {
        return AviaryType.SMALL;
    }

}
