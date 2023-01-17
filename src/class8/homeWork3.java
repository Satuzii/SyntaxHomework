package class8;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        /*
        3) Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of range");
        int start = sc.nextInt();
        System.out.println("Enter end of range");
        int end = sc.nextInt();


        int numEven = 0;
        int numOdd = 0;

        if (start < end) {
            for (int i = start; i <= end; i++) {

                if (i % 2 == 0) {
                    numEven += i;
                } else {
                    numOdd += i;
                }
            }
            System.out.print("Even num: " + numEven+ ", Odd num: " + numOdd);
        } else {
            for (int i = start; i >= end; i--) {

                if (i % 2 == 0) {
                    numEven += i;
                } else {
                    numOdd += i;
                }
            }
            System.out.print("Even num: " + numEven+ ", Odd num: " + numOdd);
        }
    }
}