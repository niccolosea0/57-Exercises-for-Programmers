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

        // Prompt user for number of people
        int peopleNum = getNumber("How many people?");

        int[] peopleArray = new int[peopleNum];

        int totalSlices = 0;

        for (int i = 0; i < peopleArray.length; i++) {
            totalSlices += getNumber("How many slices of pizza does person " + (i + 1) + " wants? ");
        }

        // Calculate number of pizzas would be needed
        int pizzaNum = totalSlices / 8;

        // Increas number of pizza by one, to get full pizzas
        if (pizzaNum % 8 != 0 || pizzaNum == 0) {
            pizzaNum++;
        }

        System.out.println("You would need to buy " + pizzaNum + " full pizzas");

    }

}
