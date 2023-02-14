package org.example;

public class Dog extends Predactor implements Runable,Swimable{
    public Dog(String nickaname) {
        super(nickaname);
    }

    @Override
    public String say() {
        return "gav-gav";
    }

    @Override
    public String toString() {
        return String.format("I'm dog.  "+super.toString()) + " My speed is" + speedOfRun();
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 30;
    }

}
