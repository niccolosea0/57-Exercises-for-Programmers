import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {

        // Get list
        List<String> list = createEmployeeList();

        // Get size of the list
        int employeeNum = list.size();

        // Print number of employeees
        System.out.println("There are " + employeeNum + " employees:");

        // Print employee's names


        // Enter employe name which we want to remove

        // Print remaining employees
        
         
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
}
