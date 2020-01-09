package practice;



// all salesperson is should make 12 sales
// if they're sales are met then " congratulated your sales are met"
// if they are short they are informed of how many sales they are short

import java.util.Scanner;

public class QuotaCal {

    public static void main(String[] args) {

        //initialize what we know
        int quota = 12;

        //what we don't know
        System.out.print("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.print("Congrats you have met the quota");
        }
        else {
            int SaleShort = quota - sales;
            System.out.print("you did not the meet the quota. You were "  + SaleShort + " sales short");
        }



    }

}
