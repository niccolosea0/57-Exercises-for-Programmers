import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class PasswordGenerator {

    public static final Scanner scanner = new Scanner(System.in);
    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/`~";

    public static void main(String[] args) {

        Random rand = new Random();

         int passLength = getNumber("What's the minimum length? ");
         int numCount = getNumber("How many numbers? ");
         int specialCount = getNumber("How mant special characters? ");

         String password = getRandomPassword(rand, passLength, numCount, specialCount);
         String randomizedPassword = shufflePassword(rand, password, passLength);


         System.out.println("Your password: " + password);
         System.out.println("Your randomized password: " + randomizedPassword);
    }

    private static String shufflePassword(Random random, String password, int passLength) {

        // List to store characters from the string
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < passLength; i++) {

            list.add(password.charAt(i));
        }


        String randomPassword = "";

        for (int i = 0; i < list.size(); i++) {
            
            // get random number from pass length
            int randIndex = random.nextInt(list.size());

            // get random chararacter, from list
            char c = list.get(randIndex);
            
            // remove character from password
            list.remove(randIndex);
            
            // add character to randompassword
            randomPassword += c;
        }

        return randomPassword;
    }

    private static String getRandomPassword(Random random, int passLength, int numCount, int specialCount) {

        // Generate letters count
        int lettersCount = passLength - (specialCount + numCount);
        
        // Get 3 different parts of password
        String letters = getRandomCharacters(random, LETTERS, lettersCount);
        String numbers = getRandomCharacters(random, NUMBERS, numCount);
        String symbols = getRandomCharacters(random, SYMBOLS, specialCount);

        // Concat these parts
        String password = "" + letters + numbers + symbols ;

        // return final password
        return password;
    }

    private static String getRandomLetters(Random random, String str, int size) {

        // Return letters
        return getRandomCharacters(random, str, size);

    }
    private static String getRandomNumbers(Random random, String str, int size) {

        // Return numbers
        return getRandomCharacters(random, str, size);

    }

    private static String getRandomSymbols(Random random, String str, int size) {

        // Return symbols
        return getRandomCharacters(random, str, size);

    }
    
    private static String getRandomCharacters(Random random, String str, int size) {

        String password = "";

        for (int i = 0; i < size; i++) {

            // get random character from provided String
            char randomChar = str.charAt(random.nextInt(size));

            // Add this random character to password
            password += randomChar;

        }

        return password;


    }

    private static int getNumber(String prompt) {

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();

    }
}
