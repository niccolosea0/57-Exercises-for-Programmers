import java.util.Scanner;

public  class ComputeInterest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            int principal = (int) getNumber("Enter principal: ");
            double interestRate = getNumber("Enter rate of interest: ");
            int years = (int) getNumber("Enter the number of years: ");

            int amount = calculateSimpleInterest(principal, interestRate, years);

            System.out.printf("\nAfter %d years at %.1f%%, the investment will be worth $%d\n", years, interestRate, amount);

            System.out.println();

            calculateAmountEachYear(principal, interestRate, years);
         
    }

    private static int calculateSimpleInterest(int p, double r, int y) {
            return (int) (p * (1 + (r / 100 * y)));
    }

    private static void calculateAmountEachYear(int principal, double rate, int years) {

        for (int i = 1; i <= years; i++) {
            int amount = (int) (principal * (1 + (rate / 100 * i)));
            System.out.printf("Amount at the end of year %d is: $%d\n", i, amount);
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


}
