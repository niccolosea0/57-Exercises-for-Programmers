import java.util.Scanner;

public class Solution {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int N = 72;

    public static void main(String[] args) {

        int rate = getValidInput();
        double years = (double) N / rate;

        System.out.printf("It will take %.0f years to double your initial investment\n", Math.ceil(years));
         
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please provide valid input");
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }

    public static int getValidInput() {
        int rate = getNumber("What is the rate of return? ");

         while (rate == 0) {
            System.out.println("Division by zero is illegal!, please provide valid input");
            rate = getNumber("What is the rate of return? ");
        }

        return rate;
    }

}
