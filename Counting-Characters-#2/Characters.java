/* File: Characters.java


 * Create a program that prompts for an input string and dis-
 * plays output that shows the input string and the number of
 * characters the string contains.


 * Example Output:
 *  What is the input string? Homer
 *  Homer has 5 characters.

 * Constraints
 * • Be sure the output contains the original string.
 * • Use a single output statement to construct the output.
 * • Use a built-in function of the programming language to
 *   determine the length of the string.

 Challenges
 *  • If the user enters nothing, state that the user must enter
 *  something into the program.

 *  • Implement this program using a graphical user interface
 *  and update the character counter every time a key is
 *  pressed. If your language doesn’t have a particularly
 *  friendly GUI library, try doing this exercise with HTML
 *  and JavaScript instead.

*/

import java.util.Scanner;


public class Characters {

    public static void main(String[] args) {

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("What is the input string? ");
        String userInput = scanner.nextLine();

        // Calculate size of the input
        int inputLength = userInput.length();

        if (inputLength == 1) {
            System.out.println(userInput + " has " + inputLength + " character");
        }
        else if(inputLength > 1) {
            System.out.println(userInput + " has " + inputLength + " characters");
        }
        else {
            System.out.println("You entered nothing, so you got not size!");
        }
        

    }
}
