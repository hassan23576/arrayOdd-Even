package looping;


import java.util.Scanner;

// each employee makes $40 an hour, calculate how much each employee makes. No overtime.
public class GrossPayInputValidation {

    public static void main(String[] args) {

        int hourlyRate = 40;
        int maxHour = 45;

        System.out.println("Enter your time sheet hours ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHour || hoursWorked < 1){
            System.out.println("Your entry is invalid. Please try again");
            hoursWorked = scanner.nextDouble();
        }
            scanner.close();

        double grossPay = hoursWorked * hourlyRate;
        System.out.println("Your gross pay is $ " + grossPay);
    }


}
