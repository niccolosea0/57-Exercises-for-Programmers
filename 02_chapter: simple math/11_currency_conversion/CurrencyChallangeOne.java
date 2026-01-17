 /* File CurrencyChallangeOne.java */
  /* This program converts converts currency, by specified currency codes */
 
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

public class CurrencyChallangeOne {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Dictionary<String, Double> d = new Hashtable<>();

        d.put("EUR", 136.60);
        d.put("USD", 116.25);
        d.put("GBP", 114.30);
        d.put("LARI", 100.45);

        System.out.println("There are following currencys supported:");
        System.out.println(d.toString());        

        String sourceCurrency = getCurrency("Enter source currency: ");
        String targetCurrency = getCurrency("Enter target currency: ");

        if (d.get(sourceCurrency) == null || d.get(targetCurrency) == null) {
            System.out.println("Unsoported Currency type");
            System.exit(1);
        }

        double rateFrom = d.get(sourceCurrency);
        double rateTo = d.get(targetCurrency);

        double amountFrom = getNumber("How many " + sourceCurrency + " are you exchanging? ");

        double amountTo = (amountFrom * rateFrom) / rateTo;

        System.out.printf("%.2f %s at an exchange rate of %.2f is %.2f %s\n", amountFrom, sourceCurrency, rateFrom, amountTo, targetCurrency);

    }

    private static double getNumber(String prompt) {
        System.out.print(prompt);

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextDouble();
    }

    private static String getCurrency(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextLine()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextLine();
    }
}
