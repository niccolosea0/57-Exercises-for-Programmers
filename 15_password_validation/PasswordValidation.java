/* File PasswordValidation.java */
/* Simple programm that validates user's password */

import java.io.Console;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PasswordValidation {
    
    private static final String myPassword = "Winnypuhhy%152";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         Map<String, String> map = new HashMap<>();
         map.put("Amadeo", "Amadeo123!");
         map.put("Giviko", "GivikoBichi123@");
         map.put("Bichiko", "Chichiko123$");

         System.out.print("What is your username? ");
         String userName = scanner.nextLine();
         
         Console console = System.console();

         if (console == null) {
             System.out.println("No console available!");
             return;
         }

         char[] password = console.readPassword("What is the password?");

         String passwordStr = new String(password);

         if (passwordStr.equals(map.get(userName))) {
             System.out.println("Welcome!");
         } else {
             System.out.println("I don't know you");
         }

        // Clear password from memory
        Arrays.fill(password, ' ');
    }
}
