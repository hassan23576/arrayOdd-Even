package datastructure.linkedlist;

import java.util.LinkedList;

public class OfferLast {

    public static void main(String[] args) {

        LinkedList<String> carChoice = new LinkedList<>();
        carChoice.add("Mercedes");
        carChoice.add("Lexus");
        carChoice.add("BMW");
        carChoice.add("Jaguar");
        System.out.println("These are my next car buying choices: " + carChoice);

        carChoice.addLast("Honda");
        System.out.println("I've added another car to my list " + carChoice);
    }
}
