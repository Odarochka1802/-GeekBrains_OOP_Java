package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(
                new Cat("Barsik"),
                new Dog("Sharik"),
                new Cow("Murka"),
                new Rabbit("Whik"),
                new Duck("Donald"),
                new Butterfly("Asya"),
                new Bear("Balu")));
        for (Sayable animal:zoopark.getSayable()) {
            System.out.println(animal.say());

        }
        System.out.println(" ");
        System.out.println("List of running animals");
        for (Runable animal:zoopark.getRunable()) {
            System.out.println(animal);
        }
        System.out.println(" ");
        System.out.println("List of flying animals");
        for (Flyable animal:zoopark.getFlyable()) {
            System.out.println(animal);
        }
        System.out.println(" ");
        System.out.println("List of swimming animals");
        for (Swimable animal:zoopark.getSwimable()) {
            System.out.println(animal);
        }
        System.out.println(" ");
        System.out.println("Running champion:");
        System.out.println(zoopark.getChempion());
        System.out.println(" ");
        System.out.println("Flying champion:");
        System.out.println(zoopark.getChempionFly());
        System.out.println(" ");
        System.out.println("Swimming champion:");
        System.out.println(zoopark.getChempionFly());
    }
}