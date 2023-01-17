package class5;

import java.util.Scanner;

public class homework4switch {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth month (e.g. January, February, etc.):");
        String month = sc.nextLine();

        switch (month) {
            case "December", "January", "February":
                System.out.println("Winter");
                break;
            case "March", "April", "May":
                System.out.println("What day of the month is it?");
                break;
            case "June", "July", "August":
                System.out.println("Summer");
                break;
            case "September", "October", "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }
    }
}


