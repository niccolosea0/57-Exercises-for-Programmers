import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class FilterValues {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Read file and get list version of it
        List<String> linesList = readFile();

        // Get String version of the list, to manipualte it
        String lines = getStringVersion(linesList);

        // Transfer string into string arr
        String[] linesArr = manipulateString(lines);

        // Get int array, of numbers
        int[] numbers = getIntArray(linesArr);

        // Print even numbers from the arr
        printEvenNumbers(numbers);
    }

    private static void printEvenNumbers(int[] arr) {

        System.out.print("Even numbers are: ");
        for (Integer num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

    private static int[] getIntArray(String[] arr) {

        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                numbers[i] = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                System.out.println("File should contain only numeric values, symbol will change as 0");
            }
        }

        return numbers;
    }

    private static String[] manipulateString(String str) {
        String[] numbers = str.split(" ");
        return numbers;
    }

    private static String getStringVersion(List<String> list) {
        String linesStr = "";

        for (int i = 0; i < list.size(); i++) {
            linesStr += list.get(i) + " ";
        }

        return linesStr;
    }
        
    private static List<String> readFile() {

        BufferedReader reader = openFile("Please enter a filename: ");
        List<String> lines = new ArrayList<>();
        
        String line = "";
        try {
            while (true) {
                line = reader.readLine();
               if (line == null) {
                    break;
                } 
                lines.add(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error, while reading lines from the file!");
        }

        return lines;
    }

    private static BufferedReader openFile(String prompt) {

        BufferedReader reader = null;

        while (reader == null) {

            try {
                System.out.print(prompt);
                String filename = scanner.nextLine();
                reader = new BufferedReader(new FileReader(filename));
            } catch (IOException e) {
                System.out.println("Provide valid filename!");
            }
        }

        return reader;
    }
}
