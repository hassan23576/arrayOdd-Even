package practice;


    //car sales people makes 1500 a week
    // if the sales person exceeds 12 sales they get a bonus of 500


import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        //initialize what we already know
        int salary = 1500;
        int bonus = 500;
        int quota = 12;


        //what we don't know
        System.out.println("How many sales did the employees get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //dour
        if ( sales > 12) {
            salary = salary + bonus;
        }

        // output
        System.out.println("Employee's salary is " + salary);



    }


}
