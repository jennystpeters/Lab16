package com.gc.tdd;

import java.util.Scanner;

/**
 * Created by Jenny St. Peters on 7/27/2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {

            System.out.print("Please enter the sequence number: ");
            int enteredSequence = entry.nextInt();

            int sequence = 0;
            int i = 2;

            String test = "ajgl;kd8";
            test.matches(".*[0-9].*");

            while (sequence < enteredSequence) {
                if (isPrime(i) == 1) {
                    ++sequence;
                }
                i = i + 1;
            }

            System.out.println(i - 1);
            System.out.print("Would you like to find another: (y/n) ");
            loop = entry.next();
        }
        System.out.println("Goodbye!");
    }

    public static int isPrime(int number) {
        for (int check = 2; check < number; ++check) {
            if (number % check == 0) {
                return 0;
            }
        }
        return 1;
    }
}
