package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine the area of a circle from its radius.
 */
public class CircleArea {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.printf("Enter radius of circle: ");
        radius = input.nextInt();

        System.out.printf("Circle with radius %d is %.2f",
            radius, calcCircleArea(radius));

        input.close();
    }

    /**
     * Calculate area of a circle
     * @param radius radius of the circle
     * @return area of the circle
     */
    public static double calcCircleArea(int radius) {
        return Math.pow(radius, 2) * 3.14159;
    }
}
