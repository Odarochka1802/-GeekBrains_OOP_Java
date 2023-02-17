package org.example;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1= new User("Ivan","Krjukov",44);
        User user2= new User("Miron","Krjukov",7);
        User user3= new User("Tihon","Krjukov",10);
        User user4= new User("Darja","Krjukova",346);
        User user5= new User("Darja","Krjukova",32);

        Personal personal = new Personal(List.of(user1,user2,user3,user4,user5));

//        for (User user: personal) {
//            System.out.println(user);
//        }

        List<User> users = personal.toList();

        Collections.sort(users);
        for (User user: users){
            System.out.println(user);
        }

        User boss = new User("Will","Smith",50);
        User cto = new User("Bill","White",36);
        User ceo = new User("Joe","Black",39);
        User manager1 = new User("Janne","Air",28);
        User manager2 = new User("Bella","Green",30);
        User manager3 = new User("Alex", "Bright",20);
        Personal managers1 = new Personal(List.of(manager1,manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto,ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (User user:company) {
            System.out.println(user);
        }
    }
}