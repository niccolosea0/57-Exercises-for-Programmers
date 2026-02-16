import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;

        while (flag) {

            System.out.println("Let's play Guess the Number.");
            int randomNumber = getLevel(); 

            play(randomNumber);

            System.out.print("Play again? ");
            flag = playAgain();
        }

        System.out.println("Goodbye!");
        
    }

    public static void  play(int randomNumber) {

        System.out.print("I have my number, What's your guess? ");
        int guess = getGuess();

        // Count number of guesses
        int count = 1;

        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.print("Too low, Guess again: ");
                guess = getGuess();
            } else if (guess > randomNumber) {
                System.out.print("Too high, Guess again: ");
                guess = getGuess();
            }

            count++;
        }

        if (count == 1) {
            System.out.println("You got it in " + count + " guess!");
        } else {
            System.out.println("You got it in " + count + " guesses!");
        }

        getFeedback(count);
    }

    public static boolean playAgain() {

        boolean result = true;
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("n") || answer.equals("no")) {
            result = false;
        } else if (answer.equals("y") || answer.equals("yes")) {
            result = true;
        } else {
            System.out.println("Could not understand, please answer yes or no");
            result = playAgain();
        }

        return result;
    }
        

    public static int getGuess() {
        // If guess is nont-numberic assign gues with -1, to count this as a wrong guess
        String input = scanner.nextLine(); 

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Guess is non-numeric, I will count it as too low!");
            return -1;
        }

    }

    // Method to get random number in range
    public static int getRandom(int min, int max) {

        Random r = new Random();
        return (r.nextInt(max - min + 1) + min);
    }

    // Method to getNumber
    public static int getNumber(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return getNumber(prompt);
        }
    }

    // Method to get level, and random number
    public static int getLevel() {

        int level = getNumber("pick a difficulty level (1, 2, or 3): ");
        int randomNumber = 0;


        switch (level) {
            case 1 -> randomNumber = getRandom(1, 10);
            case 2 -> randomNumber = getRandom(1, 100);
            case 3 -> randomNumber = getRandom(1, 1000);
            default -> {
                System.out.println("Invalid level");
                randomNumber = getLevel();
            }
        }
        return randomNumber;
    }

    public static void getFeedback(int count) {
        if (count == 1) {
            System.out.println("You are a mind reader!");
        } else if (count >= 2 && count <= 3) {
            System.out.println("Most impressive");
        } else if (count >= 4 && count <= 6) {
            System.out.println("You can do better than that");
        } else if (count >= 7) {
            System.out.println("Better luck next time");
        }
    }
}
