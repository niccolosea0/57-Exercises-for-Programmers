import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ComputeStatistics {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        addNumbersInList(list);
        
        double standDev = standardDeviation(list);
        double mean = mean(list);
        int max = max(list);
        int min = min(list);


        System.out.printf("Standard Deviation: %.2f\n", standDev);
        System.out.println("Mean: " + mean);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        
    }

    private static void addNumbersInList(List<Integer> numList) {
        while (true) {
            System.out.print("Enter a number: ");
            String number = scanner.nextLine();
            if (number.equals("done") || number.equals("Done")) {
                break;
            }
            try {
                numList.add(Integer.parseInt(number));
            } catch (Exception e) {
                System.out.println("Invalid input! Provide number or 'done' for quit");
            }
        }
    }

    private static double standardDeviation(List<Integer> numList) {

        int size = numList.size();
        double mean = mean(numList);
        double[] array = new double[size];

        // Step 1 -- Substract
        for (int i = 0; i < size; i++) {
            array[i] = Math.pow((numList.get(i) - mean), 2);
        }

        // Step 2 -- calculate mean
        double sum = 0;
        for (double elem : array) {
            sum += elem;
        }

        double squaredMean = sum / size;

        // Step3 -- take the square root
        return Math.sqrt(squaredMean);
    }

    private static double mean(List<Integer> numList) {

        int sum = 0;

        int size = numList.size();

        for (int i = 0; i < size; i++) {
            sum += numList.get(i);
        }

        double mean = (double) sum / size;

        return mean;
    }

    private static int min(List<Integer> numList) {

        int min = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) < min) {
                min = numList.get(i);
            }
        }

        return min;
    }

    private static int max(List<Integer> numList) {

        int max = numList.get(0);

        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) > max) {
                max = numList.get(i);
            }
        }

        return max;
    }

}
