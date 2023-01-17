package class8;

import java.util.Scanner;

public class howework4 {
    public static void main(String[] args) {
 /*

 4) Write a program to ask a user to enter item
 they want to buy and the price of that item.
 Every time user enters money accumulate the amount
 and tell the user how much is left to pay off. If user
 give more money program should return a change. Whenever a
 user done with payments program should say "Thank you for shopping!"

  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item name please");
        String itemName = sc.nextLine();
        System.out.println("Enter item price please");
        double itemPrice = sc.nextDouble();

        double paid=0;

            while (paid < itemPrice) {
                System.out.print("Enter your payment amount please ");
                double payment = sc.nextDouble();

                paid += payment;

                double remaining = itemPrice - paid;

                if (remaining >= 0) {
                    System.out.println("You still need to pay £" + String.format("%.2f", remaining));
                } else {
                    double change = -remaining;
                    System.out.println("Here is your change of £" + String.format("%.2f", change));
                    break;
                }
            }
        }
    }

