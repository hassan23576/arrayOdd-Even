package practice;

import java.util.Scanner;

public class CreditResultIfElseIf {

    public static void main(String[] args) {

        System.out.println("Enter your credit score");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();
        scanner.close();

         String creditStatus = new String();

         if (creditScore <= 579){
             creditStatus = "Very poor";
         }
         else if (creditScore <= 669){
             creditStatus = "Fair";
         }
         else if (creditScore <= 739){
             creditStatus = "Good";
         }
         else if (creditScore <= 799){
             creditStatus = "Very Good";
         }
         else if (creditScore <= 850){
             creditStatus = "Exceptional";
         }
         else if (creditScore > 850){
             creditStatus = " : please enter less than 850.";
         }
        System.out.println("your credit status is " + creditStatus);
    }
}
