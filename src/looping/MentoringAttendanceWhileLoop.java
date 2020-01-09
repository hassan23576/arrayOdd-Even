package looping;

import java.util.Scanner;

public class MentoringAttendanceWhileLoop {


    //mentoring attendance 2 hours a session and 30 max
    public static void main(String[] args) {
         int mentoringVideos = 2;
         int maxHour = 30;

         System.out.println("Enter your mentoring sessions amount");
        Scanner scanner = new Scanner(System.in);
        int mentoringJoined = scanner.nextInt();

        while (mentoringJoined > maxHour || mentoringJoined < 1){
            System.out.println("Invalid enter try again");
            mentoringJoined = scanner.nextInt();
        }
        scanner.close();

        int totalMentoringVideoWatched = mentoringJoined * mentoringVideos ;
        System.out.println("Total hours of mentoring joined " + totalMentoringVideoWatched);


    }
}
