package org.example;

public abstract class Herbivores extends Animal{
    public Herbivores(String nickaname) {
        super(nickaname);
    }

    @Override
    public String feed() {
        return "herb";
    }
}

