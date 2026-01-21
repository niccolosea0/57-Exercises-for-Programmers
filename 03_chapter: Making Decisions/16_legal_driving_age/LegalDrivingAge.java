/* File: LegalDrivingAge.java */
/* This program ask's for user age and compares it to legal driving age */

import java.util.Scanner;

public class LegalDrivingAge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int age = getNumber("What is your age? ");
        String result = (age > 15) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }
}
