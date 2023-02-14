package org.example;

import java.util.*;

public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    public List<Sayable> getSayable(){
        List<Sayable> result = new ArrayList<>();
        for (Animal anim:animals) {
            result.add(anim);
        }
        result.add(radio);
        return  result;
    }
    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal anim:animals) {
            if(anim instanceof Runable) result.add((Runable) anim);
        }
        return  result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal anim:animals) {
            if(anim instanceof Flyable) result.add((Flyable) anim);
        }
        return  result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal anim:animals) {
            if(anim instanceof Swimable) result.add((Swimable) anim);
        }
        return  result;
    }

    public Runable getChempion(){
        List<Runable> runanimals = getRunable();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals){
            if (winner.speedOfRun()<item.speedOfRun())
                winner=item;
        }
        return winner;
    }
    public Flyable getChempionFly(){
        List<Flyable> runanimals = getFlyable();
        Flyable winner = runanimals.get(0);
        for (Flyable item : runanimals){
            if (winner.speedOfFly()<item.speedOfFly())
                winner=item;
        }
        return winner;
    }
    public Swimable getChempionSwim(){
        List<Swimable> swimAnimals = getSwimable();
        Swimable winner = swimAnimals.get(0);
        for (Swimable item : swimAnimals){
            if (winner.speedOfSwim()<item.speedOfSwim())
                winner=item;
        }
        return winner;
    }
}
