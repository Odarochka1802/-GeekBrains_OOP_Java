package org.example;

public class Melee implements Weapon{
    String weaponNmae;
    private int damagePoint;
    public Melee(String weaponNmae,int damagePoint) {
        this.weaponNmae = weaponNmae;
        this.damagePoint= damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponNmae='" + weaponNmae + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
