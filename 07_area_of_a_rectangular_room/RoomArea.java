/*
 *   When working in a global environment, you’ll have to present information in both metric and Imperial units. And
 *   you’ll need to know when to do the conversion to ensure the most accurate results. Create a program that calculates the area of a room. 
 *   Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.
 *   
 *   Example Output
 *   What is the length of the room in feet? 15
 *   What is the width of the room in feet? 20
 *   You entered dimensions of 15 feet by 20 feet.
 *   The area is 
 *   300 square feet
 *   27.871 square meters
 *   
 *   
 *   The formula for this conversion is
 *    m^2 = f^2 × 0.09290304
 *   
 *   Constraints
 *   • Keep the calculations separate from the output.
 *   • Use a constant to hold the conversion factor.
 *   
 *   Challenges
 *   • Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 *   • Create a new version of the program that allows you to choose feet or meters for your inputs.
 *   • Implement this program as a GUI program that automatically updates the values when any value changes.
*/

import java.util.Scanner;

public class RoomArea {

    private static final double METERS_IN_FEET = 0.09290304;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Would you like to calculate area in meters or feet? ");
        String userInput = scanner.nextLine();
        String decision = "";
        switch(userInput.toLowerCase()) {
            case "meters": 
            case "meter":
            case "m": 
                decision = "meter"; 
                break;
            case "feets": 
            case "feet":
            case "f" : 
                decision = "feet"; 
                break;
            default: 
               System.out.println("Invalid input");
               System.exit(1);
        }

        System.out.println(decision);

        // Get room width and length
        int roomLength = getNumber("What is the length of the room in " + decision + "? ");
        int roomWidth = getNumber("What is the width of the room in " + decision + "? ");

        System.out.println("You entered dimensions of " + roomLength + " " + decision + " by " + roomWidth + " " + decision);

        // Calculate area
        int area = roomWidth * roomLength;

        // Print areas        
        System.out.println("The area is");
        System.out.println(area + " square " + decision);
    }

    public static int getNumber(String prompt) {

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }
}
