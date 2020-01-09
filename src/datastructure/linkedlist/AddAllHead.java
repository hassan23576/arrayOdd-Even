package datastructure.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class AddAllHead {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("what's");
        list.add("Hassan");

        Collection<String> collect = new ArrayList<String>();
        collect.add("Your");
        collect.add("name");
        collect.add("?");
        collect.add("My");
        collect.add("name");
        collect.add("is");

        System.out.println("The LinkedLIst is " + list);

        list.addAll(1, collect);

        System.out.println("The new LinkedLIst is " + list);
    }
}
