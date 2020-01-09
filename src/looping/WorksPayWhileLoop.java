package looping;

import java.util.Scanner;

public class WorksPayWhileLoop {

    //employees making $50 an hour and max hours is 45

    public static void main(String[] args) {

        int hourlyPay = 50;
        int maxHour = 45;

        System.out.println("Enter your weekly hours worked");
        Scanner scanner = new Scanner(System.in);
        double hourWorked = scanner.nextDouble();

        while (hourWorked > maxHour || hourWorked < 1){
            System.out.println("Invalid entry. Please enter hours between 1 - 45.");
            hourWorked = scanner.nextDouble();
        }
         double grossPay = hourWorked * hourlyPay;
        System.out.println("Your week gross payment is : $ " + grossPay);

    }
}
