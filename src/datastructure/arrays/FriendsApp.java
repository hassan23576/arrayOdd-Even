package datastructure.arrays;

import javafx.animation.ScaleTransition;

import java.util.Scanner;

public class FriendsApp {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("How many friends do you have?");
        int numOfFriends = scanner.nextInt();

        String [] friends = new String [numOfFriends];

        for (int i =0; i <numOfFriends; i++) {
            System.out.println("Please enter your friend's name" + (i+1) + " 'S name" );
            String friendName = scanner.next();
            friends[i] = friendName;

        }
        for (String s : friends) {
            System.out.println(s);
        }











    }


}
