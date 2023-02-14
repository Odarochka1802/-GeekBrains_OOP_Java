package org.example;

public class Duck extends Herbivores implements Runable,Flyable,Swimable{
    public Duck(String nickaname) {
        super(nickaname);
    }

    @Override
    public String say() {
        return "Krja-krja";
    }

    @Override
    public int speedOfRun() {
        return 4;
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public String toString() {
        return "I'm duck. "+super.toString() + " My speed is " + speedOfFly();
    }

    @Override
    public int speedOfSwim() {
        return 25;
    }
}
