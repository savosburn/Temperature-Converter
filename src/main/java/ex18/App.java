/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex18;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String converter = myApp.whichConversion();
        double temp = myApp.readTemp(converter);

        // Calculations
        double result = myApp.calculateResult(converter, temp);

        // Output
        String outputString = myApp.generateOutput(converter, result);
        myApp.output(outputString);
    }

    public String whichConversion() {
        String choice;

        // make sure input is valid
        while (true) {
            System.out.print("""
                    Press C to convert from Fahrenheit to Celsius.
                    Press F to convert from Celsius to Fahrenheit.
                    Your choice:\s""");

            choice = in.nextLine();

            if (choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("F")){
                break;
            } else {
                System.out.print("Invalid choice. Choose again.");
            }

        }

        return choice;
    }

    public double readTemp(String converter) {
        if (converter.equalsIgnoreCase("C")) {
            System.out.print("Please enter your temperature in Fahrenheit: ");
        } else {
            System.out.print("Please enter your temperature in Celsius: ");
        }

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid temperature. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double calculateResult(String converter, double temp) {
        return converter.equalsIgnoreCase("C") ? ((temp - 32) * 5.0 / 9) : ((temp * 9 / 5) + 32);
    }

    public String generateOutput(String converter, double result) {
        String temp = converter.equalsIgnoreCase("C") ? "Celsius" : "Fahrenheit";
        return String.format("The temperature in %s is %.2f.", temp, result);
    }

    public void output(String generateOutput) {
        System.out.println(generateOutput);
    }
}
