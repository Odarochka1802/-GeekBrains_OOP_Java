package org.example;

public abstract class Animal implements Sayable{
    private String nickaname;

    public Animal(String nickaname) {
        this.nickaname = nickaname;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return "My name is " + nickaname  +
                '!';
    }

}

