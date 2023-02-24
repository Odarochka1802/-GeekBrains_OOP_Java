package org.example;

public class Archer extends  BaseHero<Ranged> {
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);
    }

    public int range() {
        return weapon.getRange();
    }


    @Override
    public String toString() {
        return "Archer{"+
                "weapon =" + weapon +
                "} " + super.toString();
    }
}
