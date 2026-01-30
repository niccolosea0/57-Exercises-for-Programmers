import java.util.Scanner;

public class MultiSales {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int orderAmount = getNumber("What is the order amount? ");
        // To read newline, not readed by scanner.nextInt()
        scanner.nextLine();
        String state = getString("What state do you live in? ");
        double tax = 0.0;

        if (state.equals("wisconsin")) {
            
            String residence = getString("What residence do you live in Wiscnonsin? ");
            System.out.println(tax);

            // Increase tax's for these residence
            if (residence.equals("eau claire")) {
                System.out.println(tax);
            } else if (residence.equals("dunn")) {
                System.out.println(tax);
            }
        } else if (state.equals("illinois")) {
            tax = (orderAmount * 8) / 100.;
        }

        double total = orderAmount + tax;

        System.out.printf("The tax is $%.2f\nThe total is $%.2f\n", tax,  total);
        
    
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }

    private static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }
}
