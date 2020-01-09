package practice;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {

        System.out.print("Enter your car brand");
        Scanner scanner = new Scanner(System.in);
        String carBrand = scanner.next();

        int message;

        switch (carBrand){


            case  "Honda":
            message = 27000;
            break;

            case "Toyota":
            message = 22000;
            break;

            case "Nissan":
            message = 15000;
            break;

            case "Mercedes":
            message = 40000;
            break;

            case  "Bmw":
            message = 42000;
            break;

            default :
                message = 0;
        }

        System.out.println("my car value is  "+ message);
    }
}
