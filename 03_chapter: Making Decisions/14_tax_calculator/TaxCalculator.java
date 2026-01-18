/* File TaxCalculator.java */
/* This is simple program, which calculates tax on an order amount */

import java.util.Scanner;

public class TaxCalculator {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double orderAmount = getNumber("What is the order amount? ");
        String state = getString("What is the state? ").toLowerCase();

        if (state.equals("wi")) {
            double tax = orderAmount * 5.5 / 100;
            System.out.printf("The subtotal is $%.2f\n", orderAmount);
            System.out.printf("The tax is $%.2f\n", tax);
            System.out.printf("The total is $%.2f\n", (orderAmount + tax));
        }

        // I do not use else, because task constraints mention not to use!
        if (!state.equals("WI")) {
            System.out.printf("The total is $%.2f\n", orderAmount);
        }

         
    }

    private static double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextDouble();
    }

    private static String getString(String prompt) {
        // clear scanner from left newline that comes by calling getNumber() method
        scanner.nextLine();
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
