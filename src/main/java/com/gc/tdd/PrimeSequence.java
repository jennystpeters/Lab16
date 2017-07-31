package com.gc.tdd;

/**
 * Created by Jenny St. Peters on 7/27/2017.
 */
public class PrimeSequence {
    public int primeSequence(int enteredSequence) {

        int sequence = 0;
        int i = 2;

        while (sequence < enteredSequence) {
            if (isPrime(i) == 1) {
                ++sequence;
            }
            i = i + 1;
        }
        return i - 1;
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



