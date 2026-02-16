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
        System.out.print("I have my number, What's your guess? ");
        int guess = scanner.nextInt();

        // Count number of guesses
        int count = 1;

        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.print("Too low, Guess again: ");
                guess = scanner.nextInt();
            } else if (guess > randomNumber) {
                System.out.print("Too high, Guess again: ");
                guess = scanner.nextInt();
            }
            count++;
        }

        System.out.println("You got it in " + count + " guesses!");

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
