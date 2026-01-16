import java.util.Scanner;

public  class ComputeInterest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            int principal = (int) getNumber("Enter principal: ");
            double interestRate = getNumber("Enter rate of interest: ");
            int years = (int) getNumber("Enter the number of years: ");

            int amount = calculateSimpleInterest(principal, interestRate, years);

            System.out.printf("After %d years at %.1f%%, the investment will be worth $%d\n", years, interestRate, amount);

         
    }

    private static int calculateSimpleInterest(int p, double r, int y) {
            return (int) (p * (1 + (r / 100 * y)));
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
