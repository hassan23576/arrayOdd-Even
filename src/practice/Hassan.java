package practice;


import java.util.Scanner;

public class Hassan {

    public static void main(String[] args) {
        Hassan.yahoo();
        Hassan.google();
        Hassan.name();
        Hassan.Jam();
        double salary = 6000.000;
        int newSalary = (int) salary;
        int number = (int) 85.56;
        byte x = (byte) salary;
        byte x2 = (byte) 140;
        System.out.println(newSalary);
        System.out.println(number);
        System.out.println(x);
        System.out.println(x2);

    }
    public static void yahoo(){
        int age = 20;
        double newAge = (double) age;
        System.out.println(newAge);

    }
    public static void google(){

        double man = 50 * 50;
        int woman = (int) man;
        System.out.println(woman);
    }
    public static void name (){
        String kid = "Im Cool";
        System.out.println(kid);

    }
    public static void Jam(){
        int requiredYearlySalary = 45000;
        int requiredCreditScore = 600;

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
