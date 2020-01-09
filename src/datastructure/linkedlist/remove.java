package datastructure.linkedlist;

import java.util.LinkedList;

public class remove {

    public static void main(String[] args) {
        LinkedList fruit= new LinkedList();
        fruit.add("strawberries");
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("peach");
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
    }
}
