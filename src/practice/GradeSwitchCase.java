package practice;

import java.util.Scanner;

public class GradeSwitchCase {

    public static void main(String[] args) {

        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();


        String message;
        scanner.close();

        switch (grade){
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Next time need to do  little better";
                break;
            case "D":
                message = "You need to study";
                break;
            case "F":
                message = "You will need to extra credit work";
                break;
            default:
                message = "You suck";
                break;


        }
        System.out.println(message);
    }
}
