import java.util.Scanner;

public class ValidatingInputs {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = getName("Enter the first name: ");
        String lastName = getName("Enter the last name: ");
             
    }

    public static String getName(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.equals("")) {
            System.out.println("The name must be filled in.");
            return getName(prompt);
        } else if (input.length() < 2) {
            System.out.println("The name must be at least two characters long");
            return getName(prompt);
        }

        return input;
    }
}

