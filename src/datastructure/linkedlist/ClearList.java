package datastructure.linkedlist;

import java.util.LinkedList;

public class ClearList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("haha");
        list.add("i'm");
        list.add("not");
        list.add("serious");
        System.out.println("1st list: " + list);

        list.clear();
        System.out.println("the list is clear");

        list.add("i'm");
        list.add("focus");
        list.add(".");
        System.out.println("next list: " + list);


    }
}
