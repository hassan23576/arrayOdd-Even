package practice;

/* every employees make  $1500
if employees make more than 12 sales they get another $300 bonus
 */


import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        //initiate what we already know
        int salary = 1500;
        int bonus = 300;
        int quota = 12;

        //what we want to know
        System.out.println("How many sales did the employee make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();




        //output
        if (sales > quota){
            salary = salary + bonus;

        }

        System.out.println("Employees salary is $"  + salary);

    }


}
