package org.example;

import java.util.Scanner;

public class Views {
    public Views() {
    }
    public String getName(){
        String name = prompt("Введите имя: ");
        return name;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
}}
