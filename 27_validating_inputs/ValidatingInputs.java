import java.util.Scanner;

public class ValidatingInputs {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = getName("Enter the first name: ");
        String lastName = getName("Enter the last name: ");
        String zipCode = getZipCode("Enter ZIP code: ");
             
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

    public static String getZipCode(String prompt) {

        System.out.print(prompt);
        String input = scanner.nextLine();

        try {
            String[] parts = input.split("-");
            String firstPart = parts[0];
            String secondPart = parts[1];

            if (!(firstPart.matches("[a-zA-Z]+") && secondPart.matches("[0-9]+"))) {
                System.out.println("ZIP code is invalid");
                return getZipCode(prompt);
            }
        } catch (Exception e) {
            System.out.println("ZIP code is invalid");
            return getZipCode(prompt);
        }

        return input;
    }
}

