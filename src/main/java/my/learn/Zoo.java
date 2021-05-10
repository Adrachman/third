package my.learn;

import my.learn.carnivorous.Fish;
import my.learn.carnivorous.Lion;
import my.learn.carnivorous.Tiger;
import my.learn.food.Grass;
import my.learn.food.Meat;
import my.learn.hebrivore.Duck;
import my.learn.hebrivore.Rabbit;
import my.learn.hebrivore.Zebra;
import my.learn.interfaceAnimal.Swim;
import my.learn.worker.Worker;

public class Zoo {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Duck duck = new Duck();
        Rabbit rabbit = new Rabbit();
        Zebra zebra = new Zebra();
        Meat meat = new Meat();
        Grass grass = new Grass();
        Worker worker = new Worker();

        Swim[] pond = new Swim[4];
        pond[0] = tiger;
        pond[1] = fish;
        pond[2] = duck;
        pond[3] = zebra;
        for (int i = 0; i < pond.length; i++){
            pond[i].swim();
        }

        worker.getVoice(lion);
        worker.feed(tiger,meat);
        worker.feed(duck,meat);
        worker.feed(rabbit,grass);
        worker.feed(fish,grass);

    }
}
