import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter two string and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams\n", s1, s2);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams\n", s1, s2);
        }

         
    }

    private static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length())
                return false;

        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        return Arrays.equals(s1CharArray, s2CharArray);
    }
}
