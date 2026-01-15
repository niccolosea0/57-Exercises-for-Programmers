/* File CurrencyConversion.java */
/* This program converts converts currency, from euros to U.S. dollars. */

import java.util.Scanner;

public class CurrencyConversion {

    private static Scanner scanner = new Scanner(System.in);
    private static final double rateTo = 0.86; 

    public static void main(String[] args) {

        
        double amountFrom = getNumber("How many euros are you exchanging? ");
        double rateFrom = getNumber("What is the exchange rate? ");

        double amountTo = (amountFrom * rateFrom) / rateTo;

        System.out.printf("%.2f euros at an exchange rate of %.2f is %.2f U.S. dollars.\n", amountFrom, rateFrom, amountTo);
        
    }

    private static double getNumber(String prompt) {
        System.out.print(prompt);

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextDouble();
    }

}
