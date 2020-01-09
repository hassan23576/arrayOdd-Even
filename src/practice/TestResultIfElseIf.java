package practice;

import java.util.Scanner;

public class TestResultIfElseIf {

    // grade results

    public static void main(String[] args) {

        System.out.println("Enter your test result ");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        char grade;

        if(testScore < 60){
            grade = 'F';
        }
        else if (testScore < 65){
            grade = 'D';
        }
        else if (testScore < 75){
            grade = 'C';
        }
        else if (testScore < 85){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);
    }
}
