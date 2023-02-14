package org.example;

public class Cow extends Herbivores implements  Runable{
    public Cow(String nickaname) {
        super(nickaname);
    }

    @Override
    public String toString() {
        return "I'm cow. "+super.toString() + " My speed is " + speedOfRun();
    }

    @Override
    public String say() {
        return "mu-mu";
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
