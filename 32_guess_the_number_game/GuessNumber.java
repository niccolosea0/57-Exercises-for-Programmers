import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number.");
        int level = getLevel("pick a difficulty level (1, 2, or 3): ");
        int randomNumber = 0;

        switch (level) {
            case 1 -> randomNumber = getRandom(1, 10);
            case 2 -> randomNumber = getRandom(1, 100);
            case 3 -> randomNumber = getRandom(1, 1000);
            default -> System.out.println("Invalid level");

        }
        System.out.println(randomNumber);

    }

    public static int getRandom(int min, int max) {

        Random r = new Random();
        return (r.nextInt(max - min + 1) + min);
    }

    public static int getLevel(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }
}
