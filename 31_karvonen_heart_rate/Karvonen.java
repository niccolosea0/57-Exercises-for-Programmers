import java.util.Scanner;

public class Karvonen {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int restingHR = getNumber("Enter resting pulse: ");
        int age = getNumber("Enter age: ");
        
        System.out.printf("\nResting Pulse: %d\tAge: %d\n", restingHR, age);

        System.out.println("\nIntensity |  Rate");
        System.out.println("----------|---------");
        for (int i = 55; i <= 95; i+=5) {
            double target = ((((220 - age) - restingHR) * (i * 0.01)) + restingHR);
            System.out.printf("%3d%%      | %4.0f bpm%n", i, target);
        }
         
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt);
        }

        return scanner.nextInt();
    }
}
