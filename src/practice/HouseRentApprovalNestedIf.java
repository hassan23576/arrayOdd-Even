package practice;

import java.util.Scanner;

public class HouseRentApprovalNestedIf {


    //Applicant must make minimum of 72k annually and must have credit score of 620


    public static void main(String[] args) {

        int requiredSalary = 72000;
        int requiredCreditScore = 620;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        double CreditScore = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary){
            if (CreditScore >= requiredCreditScore){
                System.out.println("You are approved for the apartment");
            }
            else {
                System.out.println("you must have credit score of " + requiredCreditScore);


            }

        }
        else {
            System.out.println("You must make $" + requiredSalary);
        }

    }
}
