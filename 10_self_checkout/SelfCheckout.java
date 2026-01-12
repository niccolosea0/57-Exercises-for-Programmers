import java.util.Scanner;

public class SelfCheckout {

    private static Scanner scanner = new Scanner(System.in);
    private static final double TAX_RATE = 5.5;

    public static void main(String[] args) {
        
        // Get subtotal and calculate tax and total
        double subTotal = calculateSubTotal();
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

    private static double calculateSubTotal() {
        System.out.println(); // New line for clarity
        int itemsNumber = getNumber("How many items would you like to purchase? ");

        double subTotal = 0;

        for (int i = 1; i <= itemsNumber; i++) {

            // Get particular item's price and quantity
            int itemPrice = getItemPrice(i);
            int itemQuantity = getItemQuantity(i);
            
            // Calculate cost of entire product (item * quantity)
            int itemCost = itemPrice * itemQuantity;

            // Add itemcost to subtotal
            subTotal += itemCost;
        }

        return subTotal;
    }

    private static int getItemPrice(int index) {
        System.out.println(); // Print new line for clarity
        return getNumber("Enter price of the item " + index + ": ");
    }

    private static int getItemQuantity(int index) {
        return getNumber("Enter quantity of the item " + index + ": ");
    }

}
