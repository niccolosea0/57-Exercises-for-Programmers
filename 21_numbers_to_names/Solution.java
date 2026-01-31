import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = getNumber("Please enter number of the month: ");

        Map<Integer, String> monthMap = new HashMap<>();

        putMonths(monthMap);

        while (!monthMap.containsKey(number)) {
            number = getNumber("Please enter number of the month between 1 and 12: ");
        }

        String month = monthMap.get(number);
        System.out.println("The name of the month is " + month);
    }

    private static void putMonths(Map<Integer, String> map) {
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "Octomber");
        map.put(11, "November");
        map.put(12, "December");
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
