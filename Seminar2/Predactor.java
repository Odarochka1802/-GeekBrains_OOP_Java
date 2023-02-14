package org.example;

public abstract class Predactor extends Animal{

    public Predactor(String nickaname) {
        super(nickaname);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
