// File: Hello.java
import java.util.Scanner;


// Create a program that prompts for an input string and dis-
// plays output that shows the input string and the number of
// characters the string contains.


// Example Output:
// What is your name? Brian
// Hello, Brian, nice to meet you!



public class Hello {

    public static void main(String[] args) {

               // Using scanner to get input
               Scanner scanner = new Scanner(System.in);
               
               // Print message
               System.out.print("What is your name? ");

               // Prompt user for name
               String name = scanner.nextLine();

               // Print final message
               System.out.println("Hello, " + name + ", nice to meet you!");
               
    }

}
