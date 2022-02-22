package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine the minimum of 3 numbers
 */
public class Minimum {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.printf("Enter first number: ");
        num1 = input.nextInt();
        System.out.printf("Enter second number: ");
        num2 = input.nextInt();
        System.out.printf("Enter third number: ");
        num3 = input.nextInt();

        System.out.printf("Smallest of the 3 numbers is %d.", calcMinimum(num1, num2, num3));

        input.close();
    }

    /**
     * Determine the minimum value of 3 numbers
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     * @return The smallest of the 3 numbers
     */
    public static int calcMinimum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
