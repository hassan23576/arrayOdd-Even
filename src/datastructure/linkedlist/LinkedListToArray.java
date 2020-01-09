package datastructure.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {

    public static void main(String[] args) {

        List<String> courses = new LinkedList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        courses.add("PHP");
        int size = courses.size();
        System.out.println("Size of the linked list = " + size);

        String[] numbers = new String[size];
        numbers = courses.toArray(numbers);

        System.out.println("Element of the array are: ");
        System.out.println(Arrays.toString(numbers));
    }
}
