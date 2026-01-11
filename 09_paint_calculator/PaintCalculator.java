/*
Exercise 9: Paint Calculator

Sometimes you have to round up to the next number rather than follow standard rounding rules.
Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one
gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must round up to the next whole gallon.

Constraints
• Use a constant to hold the conversion rate.
• Ensure that you round up to the next whole number. 

Challenges
• Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the
  value entered is not numeric.
• Implement support for a round room.
• Implement support for an L-shaped room.
• Implement a mobile version of this app so it can be used
at the hardware store.
*/

import java.util.Scanner;

public class PaintCalculator {

    private static Scanner scanner = new Scanner(System.in);

    // Amount of square feet one gallon covers
    private static final int GALLON = 360;

    public static void main(String[] args) {
        
        int length = getNumber("What is length of the room? ");

        int width = getNumber("What is width of the room? ");

        int roomArea = length * width;
        double gallonsNeeded = (double) roomArea / GALLON;

        double gallonsNeededRounded = Math.ceil(gallonsNeeded);
        System.out.println("You will need to purchase " + (int) gallonsNeededRounded + " gallons of paint to cover " + roomArea + " square feet.");
         
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            /* If inputed number is not integer, clean scanner 
               and prompt user to enter number again */
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }
}

