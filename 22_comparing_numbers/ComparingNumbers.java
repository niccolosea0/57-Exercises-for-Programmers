import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ComparingNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    // Number that represents how many numbers do we want to enter
    private static final int N = 10;

    public static void main(String[] args) {

        // Get list of the entered numbers
        List<Integer> numbersList = getListOfNumbers();

        // Get max number from the list
        int maxNum = getMax(numbersList);

        System.out.println("The largest number is " + maxNum);
    }

    // Method to enter number
    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("prompt");
        }

        return scanner.nextInt();
    }

    // Method to create a list of numbers
    private static List<Integer> getListOfNumbers() {

        // Create a list and add first number to it
        List<Integer> list = new ArrayList<>();
        int firstNumber = getNumber("Enter number 1: ");
        list.add(firstNumber);

        
        for (int i = 1; i < N; i++) {

            // Enter number
            int number = getNumber("Enter number " + (i + 1) + ": ");

            // Loop to check, if entered number equals to any of the already entered number
            for (int j = 0; j < i; j++) {

                // While entered number equals to other nubmer, ask user to enter number again
                while (number == list.get(j)) {
                    number = getNumber("You have entered that nubmer already, please enter another number: ");
                }
            }

            // Add entered number to the list
            list.add(number);
        }

        // Return final list
        return list;
    }

    // Method to find and return max number
    private static int getMax(List<Integer> list) {

        int size = list.size();
        int max = 0;

        for (int i = 0; i < size; i++) {
            int number = list.get(i);

            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
