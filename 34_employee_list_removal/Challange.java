import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Challange {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get list
        List<String> list = createEmployeeList();

        // Get size of the list
        int employeeNum = list.size();

        // Print number of employeees
        System.out.println("\nThere are " + employeeNum + " employees:");

        // Print employee's names
        printEmployeeList(list);

        // Call remove employee method
        removeEmployee(list);

        // Update employee's number
        employeeNum = list.size();

        // Write into the file
        writeIntoFile(list);
    }

    // Method that creates a Employee List and returns it
    public static List<String> createEmployeeList() {

        // Get path of the file
        List<String> employeeList = new ArrayList<>();

        try {
            // Read all lines from the file and put it into emplyeeList
            employeeList = Files.readAllLines(Paths.get("employee.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    // Method that prints the elements of the list
    public static void printEmployeeList(List<String> employeeList) {
        for (String name : employeeList) {
            System.out.println("\t" + name);
        }
    }

    // Write content into the file
    public static void writeIntoFile(List<String> employeeList) {

        List<String> lines = new ArrayList<>();
        lines.add("There are " + employeeList.size() + " employees:\n");
        for (String elem : employeeList) {
            lines.add(elem);
        }

        try {
            // Write into the employee.txt file
            Files.write(Paths.get("employee.txt"), lines);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to remove employee
    public static void removeEmployee(List<String> employeeList) {
        // Get employee name, needs to be removed
        System.out.print("\nEnter an employee name to remove: ");
        String employee = scanner.nextLine().trim();

        if (checkEmployee(employeeList, employee)) {
            int index = employeeList.indexOf(employee);
            employeeList.remove(index);
        } else {
            System.out.println("There is not employee with that name, please specify valid name");
            System.exit(1);
        }
    }

    // Method to check if employee exists in the list
    public static boolean checkEmployee(List<String> employeeList, String employeeName) {
        for (String elem : employeeList) {
            if (elem.equals(employeeName)) {
                return true;
            }
        }

        return false;
    }
}
