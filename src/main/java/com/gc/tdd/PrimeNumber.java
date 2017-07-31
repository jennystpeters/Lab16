package com.gc.tdd;

import java.util.Scanner;

/**
 * Created by Jenny St. Peters on 7/27/2017.
 */
public class PrimeNumber {

    private static Validator Validator = new Validator();

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {

            int enteredSequence = Validator.getInt("Please enter the sequence number: ", "Invalid entry. ", 0, Integer.MAX_VALUE);

            int sequence = 0;
            int i = 2;

            while (sequence < enteredSequence) {
                if (isPrime(i) == 1) {
                    ++sequence;
                }
                i = i + 1;
            }

            System.out.println(i - 1);

            loop = Validator.getString(entry, "Would you like to find another: (y/n) ", "Invalid entry. ");

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
