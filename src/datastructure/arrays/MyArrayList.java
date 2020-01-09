package datastructure.arrays;

import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {

        //How to declare an array list
        //how to initialize an array list

        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("joe");
        myArrayList.add("bob");
        myArrayList.add("tim");

        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));

        System.out.println(myArrayList.size());

        myArrayList.remove("bob");
        System.out.println(myArrayList.get(1));

        if (myArrayList.contains("joe")) { ///exist method
            System.out.println("joe exists");
        } else {
            System.out.println("joe does not exists");
        }

        myArrayList.add(1, "Sarah");
        System.out.println(myArrayList.indexOf(1));














    }
}
