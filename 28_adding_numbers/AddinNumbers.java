import java.util.Scanner;

public class AddinNumbers {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int number = getNumber("Enter a number: ");
            sum += number;
        }

        System.out.println("The total is: " + sum);
         
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter valid integer!");
            scanner.next();
        }

        return scanner.nextInt();
    }
}
