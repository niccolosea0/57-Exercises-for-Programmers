import java.util.Scanner;

public class TemperatureConverter {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Precc C to convert from Fahrenheit to Celsius");    
        System.out.println("Precc F to convert from Celsius to Fahrenheit");
        String choice = getChoice("Your choice: ");


        switch (choice) {
            case "c": 
                calculateCelsius();
                break;
            case "f": 
                calculateFahrenheit();
                break;
            default: 
                System.out.println("How did you came here? get out");
                break;
        }
    }

    private static void calculateCelsius() {
        int temp = getNumber("Please enter the temperature in Fahrenheit: ");
        System.out.println("The temperature in Celsius is " + toCelsius(temp));
    }

    private static void calculateFahrenheit() {
        int temp = getNumber("Please enter the temperature in Celsius: ");
        System.out.println("The temperature in Fahrenheit is " + toFahrenheit(temp));
    }


    private static int toCelsius(int f) {
        double temp = (f - 32) * (5/9.);
        return (int) Math.round(temp);
    }

    private static int toFahrenheit(int c) {
        double temp = (c * 9/5.) + 32;
        return (int) Math.round(temp);
    }

    private static String getChoice(String prompt) {
        System.out.print(prompt);
        String choice = scanner.nextLine().trim().toLowerCase();

        if (!choice.equals("f") && !choice.equals("c")) {
            System.out.println("Please enter either C (for celsius) or F (for Fahrenheit)!!!");
            choice = getChoice(prompt);
        }

        return choice;
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
