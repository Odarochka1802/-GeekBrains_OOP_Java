package HomeWork;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        OurLinkedList list = new OurLinkedList();
        list.add("AAAB");
        list.add("AAABB");

        list.add(1, "AAABBB");
        list.add(1, "AAABBBB");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}