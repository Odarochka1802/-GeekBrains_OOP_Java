package org.example;

public class Main{
    public static void main(String[] args){

        Views views = new Views();
        User user = new User(views.getName());

        Saveable saveable = new Persister(user);
        saveable.save();

        Reportable reportable = new ReportUser(user);
        reportable.report();
    }
}