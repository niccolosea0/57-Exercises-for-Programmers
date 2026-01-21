/*
 *   File: SimpleMath.java
 *   
 *   You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll
 *   have to convert the inputs you get to numerical data types. Write a program that prompts for two numbers. Print the
 *   sum, difference, product, and quotient of those numbers as shown in the example output:
 *   
 *   Example Output
 *   What is the first number? 10
 *   What is the second number? 5
 *   10 + 5 = 15
 *   10 - 5 = 5
 *   10 * 5 = 50
 *   10 / 5 = 2
 *   
 *   Constraints
 *   • Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
 *   • Keep the inputs and outputs separate from the numerical conversions and other processing.
 *   • Generate a single output statement with line breaks in the appropriate spots.
 *   
 *   Challenges
 *   • Revise the program to ensure that inputs are entered as
 *     numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 *   • Don’t allow the user to enter a negative number.
 *   • Break the program into functions that do the computations. You’ll explore functions in Chapter 5, Functions, on page 45.
 *   • Implement this program as a GUI program that automat- ically updates the values when any value changes.
 */
 
 import java.util.Scanner;

 public class SimpleMath {

     public static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {


         // Get numbers
         int firstNum = getNumber("What is the first number? ");
         int secondNum = getNumber("What is the second number? ");

         // Output results
         sum(firstNum, secondNum);
         substract(firstNum, secondNum);
         multiply(firstNum, secondNum);
         divide(firstNum, secondNum);

     }

     // Method that prompts user for valid number and then returns it
     public static int getNumber(String prompt) {
         System.out.print(prompt);
         while(!scanner.hasNextInt()) {
             scanner.next();
             System.out.print(prompt);
         }

         return scanner.nextInt();
     }

     public static void sum(int x, int y) {
         System.out.println(x + " + " + y + " = " + (x + y));
     }
     public static void substract(int x, int y) {
         System.out.println(x + " - " + y + " = " + (x - y));
     }
     public static void multiply(int x, int y) {
         System.out.println(x + " * " + y + " = " + (x * y));
     }
     public static void divide(int x, int y) {
         System.out.println(x + " / " + y + " = " + (x / y));
     }




}
