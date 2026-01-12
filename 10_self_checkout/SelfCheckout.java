import java.util.Scanner;

public class SelfCheckout {

    private static Scanner scanner = new Scanner(System.in);
    private static final double TAX_RATE = 5.5;

    public static void main(String[] args) {
        
        // First item
        System.out.print("Enter price of the item 1: ");
        double firstItemPrice = scanner.nextInt();

        System.out.print("Enter quantity of the item 1: ");
        double firstItemQuantity = scanner.nextInt();

        // Second item
        System.out.print("Enter price of the item 2: ");
        double secondItemPrice = scanner.nextInt();

        System.out.print("Enter quantity of the item 2: ");
        double secondItemQuantity = scanner.nextInt();

        // Third item
        System.out.print("Enter price of the item 3: ");
        double thirdItemPrice = scanner.nextInt();

        System.out.print("Enter quantity of the item 3: ");
        double thirdItemQuantity = scanner.nextInt();

        
        // Calculate subtotal, tax, total
        double subTotal = (firstItemPrice * firstItemQuantity) + (secondItemPrice * secondItemQuantity) + (thirdItemPrice * thirdItemQuantity);
        double tax = subTotal * 5.5 / 100;
        double total = subTotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);

    }

}
