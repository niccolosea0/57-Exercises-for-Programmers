// The formula for this is
//           n = (−1/30) * ((log(1 + b/p(1 - (1 + i)^30))) / log(1 + i))

import java.util.Scanner;

public class Solution {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int balance = getNumber("What is your balance? ");
        int apr = getNumber("What is the APR on the card (as a percent)? ");
        int monthlyPay = getNumber("What is the monthy payment you can make? ");

        int result = calculatePayOff(balance, apr, monthlyPay);

        System.out.printf("It will take you %d months to pay off this card\n", result);
         
    }

    public static int calculatePayOff(int b, int apr, int p) {

        //this is the daily rate
        double aprRate = apr / 100.;
        double i = aprRate / 365.;

        double dividend = Math.log(1 + ((double)b / p) * (1 - Math.pow(1 + i, 30)));

        double division = Math.log(1 + i);

        double n = (-1.0 / 30.0) * (dividend / division);

        return (int) Math.ceil(n);
    }

    public static int getNumber(String prompt) {
       System.out.print(prompt);
       while (!scanner.hasNextInt()) {
           System.out.print(prompt );
           scanner.next();
       }

       return scanner.nextInt();
    }
}
