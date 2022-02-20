package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine whether a number is even or odd
 */
public class OddOrEven {
    /**
     * Main method to run program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.printf("Enter a number: ");
        number = input.nextInt();

        System.out.printf("%d is %s.",
            number, (isEven(number)) ? "even" : "odd");

        input.close();
    }

    /**
     * Determine whether a number is even or not
     * @param number Number for which the property of even or odd will be determined
     * @return Whether or not the number is even
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}