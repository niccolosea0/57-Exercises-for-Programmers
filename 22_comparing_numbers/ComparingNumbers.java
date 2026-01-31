import java.util.Scanner;

public class ComparingNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstNumber = getNumber("Enter first number: "); 
        int secondNumber = getNumber("Enter second number: "); 

        while (secondNumber == firstNumber) {
            secondNumber = getNumber("You have entered that nubmer already, please enter another number: ");
        }

        int thirdNumber = getNumber("Enter third number: "); 

        while (thirdNumber == firstNumber || thirdNumber == secondNumber) {
            thirdNumber = getNumber("you have entered that number already, please enter different number: ");
        }

        int max = findMax(firstNumber, secondNumber, thirdNumber);
        System.out.println("The largest number is " + max);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("prompt");
        }

        return scanner.nextInt();
    }

    private static int findMax(int first, int second, int third) {

        int[] numbers = {first, second, third};

        int size = numbers.length;
        int max = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
