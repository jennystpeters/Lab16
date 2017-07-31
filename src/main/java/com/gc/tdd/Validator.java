package com.gc.tdd;

import java.util.Scanner;

/**
 * Created by Jenny St. Peters on 7/27/2017.
 */
public class Validator {

    private Scanner entry = new Scanner(System.in);

    public String getString(String prompt, String invalidPrompt) {
        boolean isValid = false;
        String s = "";
        while (isValid == false) {
            System.out.print(prompt);
            s = entry.next();  // read user entry
            entry.nextLine();  // discard any other data entered on the line
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
                isValid = true;
            } else {
                System.out.print(invalidPrompt);
            }
        }
        return s;
    }

    public int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (entry.hasNextInt()) {
                i = entry.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            entry.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public int getInt(String prompt, String invalidPrompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(prompt);
            if (i < min)
                System.out.print(invalidPrompt);
            else if (i > max)
                System.out.print(invalidPrompt);
            else
                isValid = true;
        }
        return i;
    }
}
