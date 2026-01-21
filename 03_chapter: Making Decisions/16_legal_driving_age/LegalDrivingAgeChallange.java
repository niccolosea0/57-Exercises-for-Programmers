/* File: LegalDrivingAgeChallange.java */
/* This program ask's for user age and compares it to legal driving age */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class LegalDrivingAgeChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // Creating map of countries and their legal driving ages
        Map<String, Integer> countries = new HashMap<>();

        putCountries(countries);

        int age = getNumber("What is your age? ");
        while (age < 0) {
            System.out.println("Invalid input");
            age = getNumber("What is your age? ");
        }

        final int userAge = age;

        List<String> userCanDrive = new ArrayList<>();
        List<String> userCanNot = new ArrayList<>();

        countries.forEach((key, value) -> {
            if (userAge >= countries.get(key)) {
                userCanDrive.add(key);
            } else {
                userCanNot.add(key);
            }
        });


        System.out.println("\nYou are old enough to legally drive in " + userCanDrive.size() + " countries");
        userCanDrive.forEach(name -> System.out.println(name));

        System.out.println("\nYou are NOT old enough to legally drive in " + userCanNot.size() + " countries");
        userCanNot.forEach(name -> System.out.println(name));
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter valid age");
            System.out.print(prompt);
        }

        return scanner.nextInt();

    }

    private static void putCountries(Map<String, Integer> map) {

        map.put("United States", 16);
        map.put("Canada", 16);
        map.put("United Kingdom", 17);
        map.put("Germany", 18);
        map.put("France", 18);
        map.put("Italy", 18);
        map.put("Spain", 18);
        map.put("Australia", 16);
        map.put("Japan", 18);
        map.put("South Korea", 18);
        map.put("India", 18);
        map.put("Brazil", 18);
        map.put("Mexico", 18);
        map.put("Georgia", 18);

    }
}
