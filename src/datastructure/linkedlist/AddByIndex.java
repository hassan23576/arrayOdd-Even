package datastructure.linkedlist;

import java.util.LinkedList;

public class AddByIndex {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("H");
        list.add("S");
        list.add("A");
        list.add("N");
        System.out.println("my previous list:" + list);
        list.add(1, "A");
        list.add(3, "S");

        System.out.println("current list is " + list);
    }
}
