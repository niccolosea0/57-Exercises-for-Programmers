/* File PasswordValidation.java */
/* Simple programm that validates user's password */

import java.util.Scanner;

public class PasswordValidation {
    
    private static Scanner scanner = new Scanner(System.in);
    private static final String myPassword = "Winnypuhhy%152";

    public static void main(String[] args) {
         
         System.out.print("What is the password? ");
         String userPassword = scanner.nextLine();

         if (userPassword.equals(myPassword)) {
             System.out.println("Welcome!");
         } else {
             System.out.println("I don't know you");
         }

    }
}
