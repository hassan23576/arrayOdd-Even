package practice;

import java.util.Scanner;

public class StatusIfElseIf {
    /* Driver membership status
    Platinum 5k-10k
    Gold 3k-4.99k
    silver 1k - 2.99k
    bronze 1 - 999
      */

    public static void main(String[] args) {

        System.out.println("Enter your rides");
        Scanner scanner = new Scanner(System.in);
        double rides = scanner.nextDouble();

        String Membership = new String();

        if ( rides >= 5000){
            Membership = "Platinum";
        }
        else if (rides >= 3000){
            Membership = "Gold";
        }
        else if (rides >= 1000){
            Membership = "Silver";
        }
        else if (rides >= 1){
            Membership = "Bronze";

        }
        System.out.println("Your Membership status is " + Membership);





    }
}
