import java.util.Scanner;

public class SelfCheckout {

    private static Scanner scanner = new Scanner(System.in);
    private static final double TAX_RATE = 5.5;

    public static void main(String[] args) {
        
        // First item
        System.out.println();

        int firstItemPrice = getNumber("Enter price of the item 1: ");
        int firstItemQuantity = getNumber("Enter quantity of the item 1: ");


        // Second item
        System.out.println();

        int secondItemPrice = getNumber("Enter price of the item 2: ");
        int secondItemQuantity = getNumber("Enter quantity of the item 2: ");


        // Third item
        System.out.println();

        int thirdItemPrice = getNumber("Enter price of the item 3: ");
        int thirdItemQuantity = getNumber("Enter quantity of the item 3: ");

        // Calculate subtotal, tax, total
        double subTotal = (firstItemPrice * firstItemQuantity) + (secondItemPrice * secondItemQuantity) + (thirdItemPrice * thirdItemQuantity);
        double tax = subTotal * 5.5 / 100;
        double total = subTotal + tax;

        System.out.printf("\nSubtotal: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);


    }

    // Get numeric value
    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }

}
