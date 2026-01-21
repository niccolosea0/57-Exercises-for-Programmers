/*  Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation
 *  marks themselves by using escape characters. Create a program that prompts for a quote and an author.
 *  Display the quotation and author as shown in the example output.

 *  Example Output
 *      What is the quote? These aren't the droids you're looking for.
 *      Who said it? Obi-Wan Kenobi
 *      Obi-Wan Kenobi says, "These aren't the droids
 *      you're looking for."

 *  Constraints
 *      • Use a single output statement to produce this output,
 *      using appropriate string-escaping techniques for quotes.

 *     • If your language supports string interpolation or string
 *      substitution, don’t use it for this exercise. Use string
 *      concatenation instead.

 *  Challenge
 *      • In Chapter 7, Data Structures, on page 63, you’ll practice
 *      working with lists of data. Modify this program so that
 *      instead of prompting for quotes from the user, you cre-
 *      ate a structure that holds quotes and their associated
 *      attributions and then display all of the quotes using the
 *      format in the example. An array of maps would be a
 *      good choice.
*/

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("What is the quote? ");
       String quote = "These aren\'t the drois you\'re looking for.";
       System.out.println(quote);

       System.out.print("Who said it? ");
       String author = "Obi-wan Kenobi";
       System.out.println(author);

       String output = author + "says, \"These aren\'t the droids\nyou\'re looking for.\"\n";
       System.out.print(output);
       
       /*We could do this task without couple of escape characters, but I still used it because it was mentioned.*/

    }
}
