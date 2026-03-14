import java.util.Scanner;

public class PasswordGenerator {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int passLength = getNumber("What's the minimum length? ");
        int specialCount = getNumber("How mant special characters? ");
        int numCount = getNumber("How many numbers? ");



         
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
