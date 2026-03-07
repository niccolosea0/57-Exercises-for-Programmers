import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ComputeStatistics {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        addNumbersInList(list);
        System.out.println("Numbers:");
        for (Integer elem : list) {
            System.out.println(elem);
        }
        
    }

    private static void addNumbersInList(List<Integer> numList) {
        while (true) {
            System.out.print("Enter a number: ");
            String number = scanner.nextLine();
            if (number.equals("done") || number.equals("Done") {
                break;
            }
            try {
                numList.add(Integer.parseInt(number));
            } catch (Exception e) {
                System.out.println("Invalid input! Provide number or 'done' for quit");
            }
        }
    }
}
