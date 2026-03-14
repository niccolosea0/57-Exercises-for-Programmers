import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random rand = new Random();

        // int passLength = getNumber("What's the minimum length? ");
        // int specialCount = getNumber("How mant special characters? ");
        // int numCount = getNumber("How many numbers? ");

        char character = getRandomChar(rand);
        System.out.print(character);




         
    }

    private static char getRandomChar(Random random) {

        int randomNum = getRandomNumber(random, 97, 122);

        return (char) randomNum;

    }

    private static int getRandomNumber(Random random, int min, int max) {

        return random.nextInt((max - min) + 1) + min;

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
