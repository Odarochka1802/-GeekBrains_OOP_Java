package org.example;

public class Rabbit extends Herbivores implements Runable{
    public Rabbit(String nickaname) {
        super(nickaname);
    }

    @Override
    public String toString() {
        return "I'm rabbit. "+super.toString() + " My speed is " + speedOfRun();
    }

    @Override
    public String say() {
        return "br-br";
    }

    @Override
    public int speedOfRun() {
        return 35;
    }
}
