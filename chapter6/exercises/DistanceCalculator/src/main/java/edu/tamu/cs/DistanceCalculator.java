package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine the distance between 2 coordinate points
 */
public class DistanceCalculator {
    /**
     * Main method to run function
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2;

        System.out.printf("Enter x coordinate of first point: ");
        x1 = input.nextDouble();
        System.out.printf("Enter y coordinate of first point: ");
        y1 = input.nextDouble();
        System.out.printf("Enter x coordinate of second point: ");
        x2 = input.nextDouble();
        System.out.printf("Enter y coordinate of second point: ");
        y2 = input.nextDouble();

        System.out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f",
            x1, y1, x2, y2, calcDistance(x1, y1, x2, y2));

        input.close();
    }

    /**
     * Calculate the distance between 2 points
     * @param x1 x coordinate of first point
     * @param y1 y coordinate of first point
     * @param x2 x coordinate of second point
     * @param y2 y coordinate of second point
     * @return
     */
    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
