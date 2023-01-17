package class3;

import java.util.Scanner;

public class ifElseAA {
    public static void main(String[] args) {

        //if the customer has $3 they can buy tea if they have $5 they can buy coffee

        Scanner sc = new Scanner(System.in);
        System.out.println("you can buy coffee of Tea. coffee is $5 and tea is $3");
        int customer = sc.nextInt();

        if (customer>=5) {
            System.out.println("Customer can buy coffee");
        } else if (customer>=3) {
            System.out.println("customer can buy tea");
        } else {
            System.out.println("Customer does not have enough money to buy either tea or coffee");
        }

    }
}
