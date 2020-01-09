package practice;


//TO qualify for a house loan, person must make $40,000
// also have 650 credit

import java.util.Scanner;

public class NestedIfLoanQualifier {

    public static void main(String[] args) {

        int requiredYearSalary = 40000;
        int requiredCreditScore = 650;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        double creditScore = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredYearSalary) {
            if (creditScore >= requiredCreditScore) {
                System.out.println("Congrats you qualify for a car loan");

            }
            else {
                System.out.print("Sorry you must have credit score of " + requiredCreditScore);

            }

        } else {
            System.out.print("Sorry you must make $ " + requiredYearSalary);

        }
    }
}