import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = getNumber("Please enter number of the month: ");

        Map<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "Octomber");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        String month = "";
        if (monthMap.containsKey(number)) {
            month = monthMap.get(number);
        } else {
            System.out.println("You have entered wrong number of month");
            return;
        }

        System.out.println("The name of the month is " + month);
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
