package practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class NestedFHALoan {

    //to qualify of a conventional house loan
    // you must have credit score of 600 and make 45000 a year

    public static void main(String[] args) {
        int requiredYearlySalary = 45000;
        int requiredCreditScore = 600;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        double creditScore = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredYearlySalary){
            if (creditScore >= requiredCreditScore){
                System.out.println("Congrats you qualify for a FHA loan");
            }
            else {
                System.out.println("Sorry you must have a credit score of " + requiredCreditScore);

            }
        }
        else {
            System.out.println("You must have salary of " + requiredYearlySalary + " to be qualified for FHA loan!");
        }

    }
}
