package class5;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your birth month (e.g. January, February, etc.):");
                String month = sc.nextLine();

                String season;
        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            season = "Winter";
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            season = "Spring";
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            season = "Summer";
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            season = "Fall";
        } else {
            season = "Invalid month";
        }

                System.out.println("You were born in the " + season + ".");
            }
        }


