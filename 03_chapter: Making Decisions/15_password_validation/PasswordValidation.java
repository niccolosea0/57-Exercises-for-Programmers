/* File PasswordValidation.java */
/* Simple programm that validates user's password */

import java.io.Console;
import java.util.Arrays;

public class PasswordValidation {
    
    private static final String myPassword = "Winnypuhhy%152";

    public static void main(String[] args) {
         
         Console console = System.console();

         if (console == null) {
             System.out.println("No console available!");
             return;
         }

         char[] password = console.readPassword("What is the password?");

         String passwordStr = new String(password);

         if (passwordStr.equals(myPassword)) {
             System.out.println("Welcome!");
         } else {
             System.out.println("I don't know you");
         }

        // Clear password from memory
        Arrays.fill(password, ' ');
    }
}
