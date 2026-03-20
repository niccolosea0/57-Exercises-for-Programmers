import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;

public class SortRecords {

    public static Scanner scanner = new Scanner(System.in);
    public static int COLUMNS_NUM = 4;

    public static void main(String[] args) {

        BufferedReader fileReader = openFile("Please enter a filename: ");

        List<String> linesFromFile = readFile(fileReader);

        String[][] linesArray = splitLinesToArray(linesFromFile);

        List<Map<String, String>> employeeList = buildEmployeeList(linesArray);

        employeeList.sort((e1, e2) -> {

            String lastName1 = e1.get("lastName");
            String lastName2 = e2.get("lastName");

            return lastName1.compareTo(lastName2);

        });


        System.out.printf("%-20s | %-20s | %-15s%n", "Name", "Position", "Separation Date");

        System.out.println("---------------------|----------------------|----------------");

        for (Map<String, String> employee : employeeList) {

            String name = employee.get("firstName") +  " " + employee.get("lastName");
            String position = employee.get("position");
            String separationDate = employee.get("separationDate");

            System.out.printf("%-20s | %-20s | %-15s%n", name, position, separationDate);

        }
    }

    private static List<Map<String, String>> buildEmployeeList(String[][] lines) {

        List<Map<String, String>> employees = new ArrayList<>();


        for (int i = 0; i < lines.length; i++) {
            Map<String, String> employee = new HashMap<>();

            employee.put("firstName", lines[i][0]);
            employee.put("lastName", lines[i][1]);
            employee.put("position", lines[i][2]);
            employee.put("separationDate", lines[i][3]);

            employees.add(employee);
        }

        return employees;
    }

    private static String[][] splitLinesToArray(List<String> lines) {

        int size = lines.size();

        // Create two dimensional array that will hold data
        String[][] lineArray = new String[size][COLUMNS_NUM];


        for (int i = 0; i < size; i++) {

            // Get line
            String line = lines.get(i);

            // Get columns from the line
            String[] columnStr = line.split(",");

            for (int j = 0; j < COLUMNS_NUM; j++) {

                // Check for null values
                if (j < columnStr.length) {
                    lineArray[i][j] = columnStr[j];
                } else {
                    lineArray[i][j] = "N/A";
                }

            }
        }

        return lineArray;

    }


    private static List<String> readFile(BufferedReader reader) {

        List<String> lines = new ArrayList<>();
        String line = "";

        try {
            // Skip first header line
            reader.readLine();

            while (true) {

                line = reader.readLine();

                if (line == null) {
                    break;
                }

                lines.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Something bad happened");
        }

        return lines;
    }

    private static BufferedReader openFile(String prompt) {

        BufferedReader reader = null;

        while (reader == null) {
            try {
                System.out.print(prompt);
                String filename = scanner.nextLine();
                reader = new BufferedReader(new FileReader(filename));
            } catch (IOException e) {
                System.out.println("Invalid filename! Please provide valid one!");
            }
        }

        return reader;
    }
}
