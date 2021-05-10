import my.learn.animal.Carnivorous;
import my.learn.animal.Herbivore;
import my.learn.aviary.Aviary;
import my.learn.aviary.AviaryType;
import my.learn.aviary.WrongAviaryTypeException;
import my.learn.carnivorous.Tiger;
import my.learn.food.Grass;
import my.learn.hebrivore.Duck;
import my.learn.hebrivore.Zebra;
import my.learn.worker.Worker;

public class Main {

    public static void main(String[] args){
        Tiger tiger = new Tiger();
        Grass grass = new Grass();
        Duck duck = new Duck();
        Zebra zebra = new Zebra();
        Aviary<Herbivore> herbAviary = new Aviary<>(AviaryType.MEDIUM);
        Aviary<Carnivorous> carnAviary = new Aviary<>(AviaryType.WATER);
        Worker worker = new Worker();
        worker.feed(tiger,grass);
        try {
            herbAviary.putAnimal(duck);
        } catch (WrongAviaryTypeException e){
            System.out.println(e.getMessage());
        }
        try {
            herbAviary.putAnimal(zebra);
        } catch (WrongAviaryTypeException e){
            System.out.println(e.getMessage());
        }
        try {
            carnAviary.putAnimal(tiger);
        } catch (WrongAviaryTypeException e){
            System.out.println(e.getMessage());
        }

    }
}
