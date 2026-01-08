/* File: Pizzaparty.java
 *
 *   Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.
 *   Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of
 *   slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person
 *   should get. If there are leftovers, show the number of leftover pieces.
 *   
 *   Example Output
 *   How many people? 8
 *   How many pizzas do you have? 2
 *   8 people with 2 pizzas
 *   Each person gets 2 pieces of pizza.
 *   There are 0 leftover pieces.
 *   
 *   
 *   Challenges
 *   • Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 *   • Alter the output so it handles pluralization properly, for example:
 *     Each person gets 2 pieces of pizza.
 *   or
 *     Each person gets 1 piece of pizza.
 *   Handle the output for leftover pieces appropriately as well.
 *   • Create a variant of the program that prompts for the number of people and the number of pieces each person
 *   wants, and calculate how many full pizzas you need to purchase.
*/

import java.util.Scanner;

public class PizzaParty {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt user for people and pizza numbers
        int peopleNum = getNumber("How many people?");
        int pizzaNum = getNumber("How many pizzas do you have?");

        System.out.println("\nEach pizza has 8 slices");
        int totalSlices = pizzaNum * 8;
        int slicesPerPerson = totalSlices / peopleNum;

        int leftOvers = totalSlices - (slicesPerPerson * peopleNum);

        System.out.println(peopleNum + " people with " + pizzaNum + " pizzas");

        System.out.println("\nEach person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftOvers + " leftover pieces.");


    }

    public static int getNumber(String prompt) {

        System.out.print(prompt + " ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter numeric value!");
            scanner.next();
            System.out.print(prompt + " ");
        }

        return scanner.nextInt();
    }

}
