package org.example;

public class Cat extends Predactor implements Runable {
    public Cat(String nickaname) {
        super(nickaname);
    }

    @Override
    public String say() {
        return "meow-meow";
    }

    @Override
    public String toString() {
        return "I'm cat. "+super.toString() + " My speed is " + speedOfRun();
    }

    @Override
    public int speedOfRun() {
        return 20;
    }
}
