package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Team<Footman> suadF = new Team<>();
        suadF.add(new Footman(100, "Bu", new Melee("spear", 15)));
        suadF.add(new Footman(100, "Gru", new Melee("sword", 25)));
        suadF.add(new Footman(100, "Sju", new Melee("axe", 5)));

        for (Footman item : suadF) {
            System.out.println(item);
        }
        System.out.println(suadF.getTeamHealth());
        System.out.println(suadF.getMaxRange());
        System.out.println(suadF.getSumDamage());

        Team<BaseHero> squadTwo = new Team<>();

        squadTwo.add(new Archer(15, "Jon", new Ranged("bow", 5, 50)));

        squadTwo.add(new Archer(15, "Jonatan", new Ranged("bow", 5, 50)));

        squadTwo.add(new Footman(15, "Hju", new Melee("crossbow", 25)));

        squadTwo.add(new Footman(15, "KLju", new Melee("crossbowY",  25)));

        for (BaseHero item : squadTwo) {
            System.out.println(item);
        }
        System.out.println(squadTwo.getTeamHealth());
        System.out.println(squadTwo.getMaxRange());
        System.out.println(squadTwo.getSumDamage());

        Footman footman1 = new Footman(77,"Kty",new Melee("book",33));

        Footman footman2 = new Footman(67,"KT",new Melee("glass",35));

        while (footman1.getHealth()>0 && footman2.getHealth()>0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("______");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("______");
        }
        if (footman1.getHealth()>0){
            System.out.println("Win Footman1");
        }else System.out.println("Win Footman2");
    }
}