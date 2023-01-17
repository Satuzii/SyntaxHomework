package class8;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {

        /*
        2) Create a program that will be asking user to apply for a credit card 10 times.
        As soon you get an “yes” from a user program should stop asking.
         */

            Scanner sc = new Scanner(System.in);

            boolean creditCard;

            for (int i = 0; i < 10; i++) {
            System.out.println("Please apply for a credit card or we will harras you WE ARE THE BANKS!!!");
            String userAnswers = sc.nextLine();

            creditCard = userAnswers.equalsIgnoreCase("yes");

            if (creditCard) {
                System.out.println("thanks mate. I will stop harrassing you now");
                break;
            } else {
                System.out.println("C'mon, I thought you was smarter than that. I'll ask again!");
            }
        }
    }
}
