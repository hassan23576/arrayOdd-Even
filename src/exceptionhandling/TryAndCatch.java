package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how old are you?");

        try {
            int age = scanner.nextInt();
            System.out.println("your age is " + age);
        } catch (InputMismatchException e ){
            System.out.println("your answer must be in numbers");

        }


    }

}