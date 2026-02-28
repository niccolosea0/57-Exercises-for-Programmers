import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmployeeList {

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

        // Print number of employees
        System.out.println("\nThere are " + employeeNum + " employees:");

        // Print employees
        printEmployeeList(list);
    }

    // Method that creates a Employee List and returns it
    public static List<String> createEmployeeList() {

        List<String> employeeList = new ArrayList<>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        return employeeList;
    }

    // Method that prints the elements of the list
    public static void printEmployeeList(List<String> employeeList) {
        for (String name : employeeList) {
            System.out.println("\t" + name);
        }
    }

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
