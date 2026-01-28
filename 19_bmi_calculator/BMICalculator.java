import java.util.Scanner;

public class BMICalculator {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {


        String userInput = askForUnits();

        double weight = getNumber("Enter your weight: ");
        double height = getNumber("Enter your height: ");

        double bmi = 0;

        if (userInput.equals("m")) {
            bmi = calculateMetricBMI(weight, height);
        } else if (userInput.equals("us")) {
            bmi = calculateUsBMI(weight, height);
        } 
        
        System.out.printf("Your BMI is %.1f\n", bmi);

        checkBMI(bmi);
    }
    
    private static double calculateUsBMI(double weight, double height) {
        double bmi = (weight / (height * height)) * 703;
        return bmi;
    }

    private static double calculateMetricBMI(double weight, double height) {
        double bmi = (weight / (height * height)) ;
        return bmi;
    }

    private static void checkBMI(double bmi) {
        if (bmi >= 18.5 && bmi <= 25) {
           System.out.println("You are within the ideal weight range."); 
        } else if (bmi < 18.5) {
            System.out.println("You are pretty underweight, you shall see a doctor");
        } else if (bmi > 25) {
            System.out.println("You are pretty much overweight my dear, you need to see a doctor");
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

    private static String askForUnits() {
        System.out.print("Would you like to calculate in Metric or US units (enter m/metric or us)? ");
        String userInput = scanner.nextLine().trim().toLowerCase();
        
        switch (userInput) {

            case "m": case "metric":
                userInput =  "m";
                break;
            case "us":
                userInput =  "us";
                break;
            default:
               System.out.println("You have entered unknown unit");
               System.exit(1);
        }

        return userInput;
    }
}
