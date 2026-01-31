import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = getNumber("Please enter number of the month: ");
        String month = "";

        switch (number) {

            case 1: 
                month = "January";
                break;
            case 2: 
                month = "February";
                break;

            case 3: 
                month = "March";
                break;

            case 4: 
                month = "April";
                break;

            case 5: 
                month = "May";
                break;

            case 6: 
                month = "June";
                break;

            case 7: 
                month = "July";
                break;

            case 8: 
                month = "August";
                break;

            case 9: 
                month = "September";
                break;

            case 10: 
                month = "Octomber";
                break;

            case 11: 
                month = "November";
                break;

            case 12: 
                month = "December";
                break;

            default:
                System.out.println("You have entered invalid number of Month!");
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
