package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Persister implements Saveable{
    private User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("Новое имя: ");
            writer.write("\"clientName\":\""+ user.getName() + "\",\n");

            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Save user: " + user.getName());
    }
}