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
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         boolean isTrue = false;

         String firstNumber = "";
         String secondNumber = "";
         int firstNum = 0;
         int secondNum = 0;

         while (true) {

            System.out.print("What is the first number? ");
            firstNumber = scanner.nextLine();
            try {
                firstNum = Integer.parseInt(firstNumber);
            } catch (Exception e) {
               System.out.println("Enter a number!");
               continue;
            }
            if (firstNum < 0) {
                System.out.println("Number must be Positve!");
                continue;
            }

            System.out.print("What is the second number? ");
            secondNumber = scanner.nextLine();
            try {
                secondNum = Integer.parseInt(secondNumber);
            } catch (Exception e) {
                System.out.println("Enter a number!");
                continue;
            }

            if (secondNum < 0) {
                System.out.println("Number must be Positve!");
                continue;
            }


            break;

         }


         System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
         System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
         System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
         System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));


     }
}
