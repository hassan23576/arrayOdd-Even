package datastructure.linkedlist;

import java.util.LinkedList;

public class OfferFirst {

    public static void main(String[] args) {

        LinkedList<String> laptop = new LinkedList<>();
        laptop.add("Dell studio");
        laptop.add("Dell netbook");
        laptop.add("HP beats");
        laptop.add("Toshiba");
        System.out.println("These are my old laptops " + laptop);

        laptop.addFirst("Macbook Pro");
        System.out.println("My latest laptop is first on the list: " + laptop);


    }
}
