package datastructure.linkedlist;

import java.util.LinkedList;

public class IndexOf {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("james");
        list.add("patrick");
        list.add("Tariq");
        list.add("Tasha");
        list.add("Tommy");
        System.out.println("These are power characters " + list);

        System.out.println("what is the index of patrick and tariq " + list.indexOf("james")+ " "+ list.indexOf("Tommy"));



    }


}
