import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class BloodAlcoholCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final double MEN_RATIO = 0.73;
    private static final double FEMALE_RATIO = 0.66;

    public static void main(String[] args) {

        Map<String, Double> stateLimits = new HashMap<>();
        stateLimits.put("CA", 0.08);
        stateLimits.put("NY", 0.08);
        stateLimits.put("TX", 0.08);
        stateLimits.put("UT", 0.05);

        System.out.println("Enter state (e.g. CA, NY, UT): ");
        String state = scanner.nextLine().trim().toUpperCase();

        if (!stateLimits.containsKey(state)) {
            System.out.println("State not found.");
            return;
        }

        double legalLimit = stateLimits.get(state);

        double w = getNumber("Enter your weight: ");
        scanner.nextLine();
        String gender = getGender("Enter your gender (F/Female or M/Male): ");
        double a  = getNumber("Enter number of total alcohol consumed in ounces (oz): ");
        double h = getNumber("Enter number of hours since last drink: ");

        double ratio = 0;

        if (gender.equals("m")) {
            ratio = MEN_RATIO;
        } else {
            ratio = FEMALE_RATIO;
        }

        double BAC = (a * 5.14 / (w * ratio)) - (0.015 * h);
        System.out.printf("Your BAC is %.2f\n", BAC);

        if (BAC < legalLimit) {
            System.out.println("It is legal for you to drive in " + state);
        } else {
            System.out.println("It is NOT legal for you to drive in " + state);
        }

         
    }

    private static double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextDouble();
    }

    private static String getGender(String prompt) {
        System.out.print(prompt);
        String gender = scanner.nextLine().toLowerCase();
        if (gender.equals("f") || gender.equals("female")) {
            gender = "f";
        } else if (gender.equals("m") || gender.equals("male")) {
            gender = "m";
        } else {
           System.out.println("Please enter either (F/Female) or (M/Male) !!!");
           gender = getGender(prompt);
        }

        return gender;
    }
}
