package org.example;

public class Footman extends BaseHero<Melee>{

    public Footman(int health, String name, Melee weapon) {
        super(health, name, weapon);
    }

    @Override
    public String toString() {
        return "Footman{"+
                "} " + super.toString();
    }
}
