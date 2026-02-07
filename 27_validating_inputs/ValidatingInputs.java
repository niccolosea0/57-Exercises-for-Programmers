import java.util.Scanner;

public class ValidatingInputs {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = getName("Enter the first name: ");
        String lastName = getName("Enter the last name: ");
        String employeeId = getEmployeeId("Enter the Employee ID: ");
        int zipCode = getZipCode("Enter ZIP code: ");

        System.out.printf("Name: %s\nlastName: %s\nemployeeId: %s\nZipCode: %d\n", firstName, lastName, employeeId, zipCode);
             
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

    public static String getEmployeeId(String prompt) {

        System.out.print(prompt);
        String input = scanner.nextLine();

        try {
            String[] parts = input.split("-");
            String firstPart = parts[0];
            String secondPart = parts[1];

            if (!(firstPart.matches("[a-zA-Z]+") && secondPart.matches("[0-9]+"))) {
                System.out.println("ZIP code is invalid");
                return getEmployeeId(prompt);
            }
        } catch (Exception e) {
            System.out.println("ZIP code is invalid");
            return getEmployeeId(prompt);
        }

        return input;
    }

    public static int getZipCode(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        int zipCode = 0;

        try {
            zipCode = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Invalid input, zip code must be numberic");
            return getZipCode(prompt);
        }

        return zipCode;
    }
}

