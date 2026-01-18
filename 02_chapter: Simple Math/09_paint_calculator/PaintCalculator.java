import java.util.Scanner;

public class PaintCalculator {

    private static Scanner scanner = new Scanner(System.in);
    private static final double PI = 3.141592;

    // Amount of square feet one gallon covers
    private static final int GALLON = 360;

    public static void main(String[] args) {

        // Call method to print area of an originalroom
        originalTask();

        // Call method to seperate lines more or less pretty.
        printSeperatorCharacters();

        // Call method to calculate area of an round room
        roundRoom();
        
        // Again seperator characters
        printSeperatorCharacters();

        // Call method to calculate area of an L-Shaped room
        LShapedRoom();
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

    private static void originalTask() {
        
        System.out.println("\nLets calculate area for a normal room.\n");

        // ORIGINAL TASK, NO CHALLANGES

        int length = getNumber("What is length of the room? ");

        int width = getNumber("What is width of the room? ");

        int roomArea = length * width;
        double gallonsNeeded = (double) roomArea / GALLON;

        double gallonsNeededRounded = Math.ceil(gallonsNeeded);
        System.out.println("You will need to purchase " + (int) gallonsNeededRounded + " gallons of paint to cover " + roomArea + " square feet.");

    }

    private static void roundRoom() {

        System.out.println("Lets calculate now for a round room.\n");

        // IMPLEMENT SUPPORT FOR A ROUND ROOM

        int radius  = getNumber("What is the radius of the round room? ");

        // Area of the round room
        double roundRoomArea = PI * (radius * radius);

        // Gallons needed for a round room
        double gallonsNeeded = roundRoomArea / GALLON; 
       
        System.out.println("You will need to purchase " + (int) Math.ceil(gallonsNeeded) + " gallons of paint to cover " + Math.round(roundRoomArea) + " square feet.");
    }

    private static void LShapedRoom() {

        System.out.println("Lets calculate now for L-Shaped Room.\n");
        // IMPLEMENT SUPPORT FOR AN L-SHAPED ROOM

        /*In order to calculate area of the L-shaped room we need to divide it in 2 rectangles, like left and right rectangle
          In this program we will have left and right rectangles and their corresponding sizes, then we will calculate area of entire rectangle
        */

        // Left rectangle
        int leftRectLength = getNumber("Enter length of the left rectangle: ");
        int leftRectWidth = getNumber("Enter width of the left rectangle: ");

        // Right rectangle
        int rightRectLength = getNumber("Enter length of the right rectangle: ");
        int rightRectWidth = getNumber("Enter width of the right rectangle: ");

        // Calculate area os rectangles
        int leftRectArea = leftRectLength * leftRectWidth;

        int rightRectArea = rightRectLength * rightRectWidth;

        // Area of entire rectangle
        int totalArea = leftRectArea + rightRectArea;
        double gallonsNeeded = (double) totalArea / GALLON;

        System.out.println("\nYou will need to purchase " + (int) Math.ceil(gallonsNeeded) + " gallons of paint to cover " + totalArea + " square feet.");

    }

    public static void printSeperatorCharacters() {
        String repeatedCharacter = "=".repeat(50);

        // Print new line, the 2 lines of =, then new line again
        System.out.println();
        System.out.println(repeatedCharacter);
        System.out.println(repeatedCharacter);
        System.out.println();
    }
}

