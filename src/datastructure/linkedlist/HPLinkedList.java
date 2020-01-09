package datastructure.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class HPLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("i'm");
        list.add("Hassan");

        Collection<String> collect = new ArrayList<String>();
        collect.add("I");
        collect.add("will");
        collect.add("get");
        collect.add("an");
        collect.add("automation");
        collect.add("job");

        System.out.println("The LinkedList before appending collection is: " + list);
        list.addAll(collect);
        System.out.println("The LinkedList after appending collection is: " + list);





    }
}
