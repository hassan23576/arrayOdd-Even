package datastructure.linkedlist;

import java.util.LinkedList;

public class CloneList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("clone");
        list.add("me");
        list.add("please");
        System.out.println("first list is " + list);

        LinkedList<String> sec_list = new LinkedList<>();
        sec_list = (LinkedList<String>) list.clone();
        System.out.println("this is cloned " + sec_list);




    }


}
