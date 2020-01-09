package practice;

import java.util.Scanner;

public class SwitchCaseGas {

    public static void main(String[] args) {
        System.out.println("Enter your car gallon amount ");
        Scanner scanner = new Scanner(System.in);
        int gallon = scanner.nextInt();
         int message;

         switch (gallon){

             case 1:
                 message = 30;
                 break;
             case 2:
                 message = 61;
                 break;
             case 3:
                 message = 92;
                 break;
             case 4:
                 message = 123;
                 break;
             case 5:
                 message = 154;
                 break;
             default:
                 message = 0;
                 break;
         }
              System.out.println("Your gas mileage is " + message);
    }
}
