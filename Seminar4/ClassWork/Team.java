package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Team<T extends BaseHero> implements Iterable<T> {
    List<T> dreamTeam = new ArrayList<>();

    public void add(T obj) {
        dreamTeam.add(obj);
    }

    public int getTeamHealth() {
        int teamHelth = 0;
        for (T hero : dreamTeam) {
            teamHelth += hero.getHealth();
        }
        return teamHelth;
    }

    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getMaxRange() {
        int maxRange = 0;
        for (T item : dreamTeam) {
            if (item instanceof Archer) {
                Archer archer = (Archer) item;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }
    public int getSumDamage(){
        int sumDamage=0;
        for (T hero:
             dreamTeam) {
            sumDamage+=hero.getWeapon().damage();
        }
        return sumDamage;
    }
}
