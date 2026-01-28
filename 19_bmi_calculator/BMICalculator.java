import java.util.Scanner;

public class BMICalculator {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        double weight = getNumber("Enter your weight in pounds: ");
        double height = getNumber("Enter your height in inches: ");

        double bmi = calculateBMI(weight, height);
        System.out.printf("Your BMI is %.1f\n", bmi);

        checkBMI(bmi);
    }
    
    private static double calculateBMI(double weight, double height) {
        double bmi = (weight / (height * height)) * 703;
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
    
}
