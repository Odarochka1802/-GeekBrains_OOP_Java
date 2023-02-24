package org.example;



public class Main {
    public static void main(String[] args) {
        Team <Swordsman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordsman("Qwerty", 250, new Sword(25)))
                .addWarriorToTeam(new Swordsman("Angus", 200, new Sword(50), new Buckler(50, 100)));

        for (Swordsman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Anika", 150, new Bow(100, 50)))
                .addWarriorToTeam(new Archer("Freya", 200, new Bow(75, 70)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
        System.out.println(team1.minArmor());
    }


}