package datastructure.linkedlist;

import java.util.LinkedList;

public class Set {

    public static void main(String[] args) {

       LinkedList<String> chocolate = new LinkedList<>();
       chocolate.add("M&M's");
       chocolate.add("Crunch");
       chocolate.add("Kit kat");
       chocolate.add("Mars");
        System.out.println("list chocolate bars " + chocolate);

        System.out.println("change chocolate " + chocolate.set(1, "Twix"));
        System.out.println("change chocolate " + chocolate.set(3, "100 Grand"));
        System.out.println("new list of chocolate " + chocolate);


    }
}
