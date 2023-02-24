package org.example;

import java.util.Random;

public abstract class BaseHero <W extends Weapon>{

    private int health;
    private String name;
    protected W weapon;

    protected BaseHero(int health, String name, W weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public boolean hit(BaseHero recepient){
        int damage=damageFork();
        return ! recepient.reduceHelth(damage);
    }
    public boolean reduceHelth(int damage){
        health-=damage;
        return health>0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public BaseHero(String name, W weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
