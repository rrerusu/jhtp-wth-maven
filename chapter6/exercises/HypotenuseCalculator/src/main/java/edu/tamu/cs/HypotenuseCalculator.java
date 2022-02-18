package edu.tamu.cs;

import java.util.Scanner;

/**
 * Calculate the hypotenuse of given side lengths
 * @author Ruk Erusu
 */
public class HypotenuseCalculator {
    /**
     * Main method to run the code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double leg1, leg2;

        System.out.printf("Enter value for leg1: ");
        leg1 = input.nextDouble();
        System.out.printf("Enter value for leg2: ");
        leg2 = input.nextDouble();

        System.out.printf("A right triangle with legs %.2f and %.2f has a hypotenuse of %.2f.",
            leg1, leg2, calcHypotenuse(leg1, leg2));

        input.close();
    }

    /**
     * Calculate the hypotenuse of the triangle with given legs
     * @param leg1 First leg of triangle
     * @param leg2 Second leg of triangle
     * @return hypotenuse of triangle
     */
    public static double calcHypotenuse(double leg1, double leg2) {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }
}
