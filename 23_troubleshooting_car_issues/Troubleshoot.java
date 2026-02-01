import java.util.Scanner;

public class Troubleshoot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nHello there, we will ask you couple of questions to help you, please answer them with (yes/y) or (no/n)");

        
        String input = getAnswer("Is the car silent when you turn the key? ");
        if (input.equals("y")) {
            leftSide();
        } else {
            rightSide();
        }
    }

    public static void leftSide() {
        String input = getAnswer("Are the battery terminals corroded? ");
        if (input.equals("y")) {
              System.out.println("Clean terminals and try starting again");
        } else {
              System.out.println("Replace cables and try again");
        }
    }

    public static void rightSide() {
        String input = getAnswer("Does the car make a clicking noise? ");
        if (input.equals("y")) {
            System.out.println("Replace the battery");
        } else {
            secondRightSide();
        }
    }

    public static void secondRightSide() {
        String input = getAnswer("Does the car crank up but fail to start? ");
        if (input.equals("y")) {
            System.out.println("Check spark plug connections");
        } else {
            thirdRightSide();
        }
    }

    public static void thirdRightSide() {
        String input = getAnswer("Does the engine start and then die? ");
        if (input.equals("y")) {
            fourthRightSide();
        } else {
            System.out.println("Wow, even I can not help you then!");
        }
    }

    public static void fourthRightSide() {
        String input = getAnswer("Does your car have fuel injection? ");
            if (input.equals("y")) {
                System.out.println("Get it in ofr service");
            } else {
                System.out.println("Check to ensure the choke is opening and closing");
            }
        }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isValid(String answer) {

        if (!answer.equals("y") && !answer.equals("yes") && !answer.equals("n") && !answer.equals("no")) {
            System.out.println("Invalid input, please enter yes(y) or no(n) ");
            return false;
        }

        return true;
    }

    public static String getInput(String prompt) {
        String input = getString(prompt);
        while (!isValid(input)) {
            input = getString(prompt);
        }

        return input;
    }

    public static String checkInput(String input) {

        String result = "";

        if (input.equals("yes") || input.equals("y")) {
            result = "y";
        } else if (input.equals("no") || input.equals("n")) {
            result = "n";
        }

        return result;
    }

    public static String getAnswer(String prompt) {
        String input = getInput(prompt);
        return checkInput(input);
    }

}
