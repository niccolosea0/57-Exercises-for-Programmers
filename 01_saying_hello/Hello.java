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
               // System.out.print("What is your name? ");

               // Prompt user for name
               // String name = scanner.nextLine();

               // Print final message
               // System.out.println("Hello, " + name + ", nice to meet you!");


               // Challenge1: Write a new version of the program without using any variables.
               // System.out.print("What is your name? ");
               // System.out.println("It is very nice to meet you " + scanner.nextLine() + ", Happy New Year's Eve!'");

               // Challenge2: Write a version of the program that displays different greetings for different people.
               System.out.println("What is your name? ");
               String name = scanner.nextLine();

               switch(name) {

                   case "Nikoloz":
                        System.out.print("Hello, " + name + ", what a good name!");

                   case "John": 
                        System.out.print("Woww, hello Mr." + name + ", nice to meet you.");

                   default:
                        System.out.print("Hi " + name + ", I am pleased to see you!");

               }
               
    }

}
