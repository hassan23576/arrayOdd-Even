package practice;


// every employees get 1000
// employees with 13 or more sales get 300 bonus

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 300;
        int quota = 10;

        System.out.println("How many sales did the employee get ?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            sales = salary + bonus;

        }

        System.out.println("employees salary is $"+ sales);
    }
}
