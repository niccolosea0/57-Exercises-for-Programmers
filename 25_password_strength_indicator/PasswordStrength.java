import java.util.Scanner;
import java.util.Arrays;

public class PasswordStrength {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       String password = getPassword("Enter password: ");

       int strengthIndicator = passwordValidator(password);

       switch (strengthIndicator) {

           case 1:
                System.out.printf("The password '%s' is a very weak password\n", password);
                break;

           case 2:
                System.out.printf("The password '%s' is a weak password\n", password);
                break;

           case 3:
                System.out.printf("The password '%s' is a strong password\n", password);
                break;

           case 4:
                System.out.printf("The password '%s' is a very strong password\n", password);
                break;

           default:
                System.out.println("How did you come here?");
       }
         
    }

    private static String getPassword(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int passwordValidator(String password) {

        int status = 0;
        int length = password.length();

        String numeric = "[0-9]+";
        String alpha = "[a-zA-Z]+";
        String alphaNumeric = "[a-zA-Z0-9]+";

        if (password.matches(numeric) && length < 8) {
            status = 1;
        } else if (password.matches(alpha) && length < 8) {
            status = 2;
        } else if (password.matches(alphaNumeric) && length >= 8) {
            status = 3;
        } else if (password.matches("\\S+") && length >= 8) {
            status = 4;
        }

        return status;
    }

} 
