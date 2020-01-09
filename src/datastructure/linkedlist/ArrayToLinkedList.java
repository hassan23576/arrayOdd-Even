package datastructure.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ArrayToLinkedList {

    public static void main(String[] args) {

        String [] language = {"Java", "C++", "C", "Python", "PHP"};
        List<String> languageList = new LinkedList<>();

        for (String s : language) {
            languageList.add(s);
        }
        System.out.println("List of popular programming language is " + languageList);
    }
}
