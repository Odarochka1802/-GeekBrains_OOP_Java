package org.example;

public class Butterfly extends Herbivores implements Flyable{

    public Butterfly(String nickaname) {
        super(nickaname);
    }

    @Override
    public int speedOfFly() {
        return 5;
    }

    @Override
    public String say() {
        return "bjjj";
    }

    @Override
    public String toString() {
        return "I'm butterfly. "+super.toString() + " My speed is" + speedOfFly();
    }
}
