import java.util.Scanner;

public class Troubleshoot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nHello there, we will ask you couple of questions to help you, please answer them with (yes/y) or (no/n)");

        
        String input = getAnswer("Is the car silent when you turn the key? ");
        if (input.equals("y")) {
            leftSide();
        } else if (input.equals("n") {


        }



        
    }

    public static void leftSide() {
        String input = getAnswer("Are the battery terminals corroded? ");
        if (input.equals("y")) {
              System.out.println("Clean terminals and try starting again");
        } else if (input.equals("n")) {
              System.out.println("Replace cables and try again");
        }
    }

    public static void firstRightSide() {
        String input = getAnswer("Does the car make a clicking noise? ");
        if(input.equals("y") {
            System.out.println("Replace the battery");
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
