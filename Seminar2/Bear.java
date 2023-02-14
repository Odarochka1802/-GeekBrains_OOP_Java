package org.example;

public class Bear extends Predactor implements Runable,Swimable{

    public Bear(String nickaname) {
        super(nickaname);
    }

    @Override
    public int speedOfRun() {
        return 56;
    }

    @Override
    public String say() {
        return "rrrr";
    }

    @Override
    public int speedOfSwim() {
        return 6;
    }

    @Override
    public String toString() {
        return "I'm bear. "+super.toString() + " My speed is " + speedOfRun();
    }
}
