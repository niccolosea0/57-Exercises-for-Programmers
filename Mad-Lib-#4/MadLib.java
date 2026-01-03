/*
 *   File: MadLib.java
    
 *   Mad libs are a simple game where you create a story tem- plate with blanks for words. You, or another player, then
 *   construct a list of words and place them into the story, creating an often silly or funny story as a result.
 *   Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a
 *   story that you create.
    
 *   Example Output
 *   Enter a noun: dog
 *   Enter a verb: walk
 *   Enter an adjective: blue
 *   Enter an adverb: quickly
 *   Do you walk your blue dog quickly? That's hilarious!
    
 *   Constraints
 *   • Use a single output statement for this program.
 *   • If your language supports string interpolation or string
 *     isubstitution, use it to build up the output.
    
 *   Challenges
 *   • Add more inputs to the program to expand the story.
 *   • Implement a branching story, where the answers to questions determine how the story is constructed. You’ll
 *     explore this concept more in the problems in Chapter 4, Making Decisions, on page 29.
*/

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a noun: ");
         String noun = scanner.nextLine();

         System.out.print("Enter a verb: ");
         String verb = scanner.nextLine();

         System.out.print("Enter an adjective: ");
         String adjective = scanner.nextLine();

         System.out.print("Enter an adverb: ");
         String adverb = scanner.nextLine();

         String question = "Do you ";
         String endSentance = "That's hilarius!";

         System.out.println(question + verb + " your " + adjective + " " + noun +  " " + adverb + "? " + endSentance);

    }
}

