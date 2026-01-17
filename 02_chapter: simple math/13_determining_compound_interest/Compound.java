/* File: Compound.java */
/* This program calculates compute interest, are you investor? then you might like this one */

/*
    The formula you’ll use for this is
    A = P(1 + r/n)^(nt)
  
    Where
    • P is the principal amount.
    • r is the annual rate of interest.
    • t is the number of years the amount is invested.
    • n is the number of times the interest is compounded per year.
    • A is the amount at the end of the investment.
 
*/


import java.util.Scanner;

public class Compound {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int p = (int) Math.ceil(getNumber("What is the principal amount? "));
        double r = getNumber("What is the rate? ");
        int t = (int) getNumber("What is the number of years? ");
        int n = (int) getNumber("What is the number of times the interest is compunded per year? ");

        double a = calculateCompoundInterest(p, r, t, n);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f\n", p, r, t, n, a);
         
    }

    private static double calculateCompoundInterest(int p, double r, int t, int n) {
        
        double ratePercentage = r / 100;
        double firstOperation = Math.pow(1 + ratePercentage / n, n*t);
        return p * firstOperation;
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
