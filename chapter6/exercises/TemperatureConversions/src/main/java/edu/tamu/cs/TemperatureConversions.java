package edu.tamu.cs;

import java.util.Scanner;

/**
 * Convert from fahrenheit to celcius and from celsius to fahrenheit
 */
public class TemperatureConversions {
    /**
     * Main method to run file
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.printf("Enter 1 to for fahrenheit and 2 for celcius: ");
        choice = input.nextInt();

        // If choice is fahrenheit
        if(choice == 1) {
            double fTemp;
            System.out.printf("Enter temperature in fahrenheit: ");
            fTemp = input.nextDouble();

            System.out.printf("%.2f in celcius is %.2f.",
                fTemp, fToC(fTemp));
        } else
            // If choice is celsius
            if(choice == 2) {
                double cTemp;
                System.out.printf("Enter temperature in celsius: ");
                cTemp = input.nextDouble();

                System.out.printf("%.2f in fahrenheit is %.2f.",
                    cTemp, cToF(cTemp));
            }

        input.close();
    }

    /**
     * Convert from fahrenheit to celcius
     * @param fTemp temperature in fahrenheit
     * @return temperature in celcius
     */
    public static double fToC(double fTemp) {
        return 5.0 / 9.0 * (fTemp - 32);
    }

    /**
     * Convert from celcius to fahrenheit
     * @param cTemp temperature in celcius
     * @return temperature in fahrenheit
     */
    public static double cToF(double cTemp) {
        return 9.0 / 5.0 * cTemp + 32;
    }
}