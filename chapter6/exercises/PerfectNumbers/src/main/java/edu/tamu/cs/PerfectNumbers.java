package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine if a number is a perfect number or not
 */
public class PerfectNumbers {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.printf("Enter number: ");
        number = input.nextInt();

        System.out.printf("%d is%s a perfect number.",
            number,
            (isPerfectNum(number)) ? "" : "n't");

        input.close();
    }

    /**
     * Determine whether a number is perfect or not
     * @param num Number that will be tested to see if it is perfect
     * @return true if the number is perfect or false if the number isn't perfect
     */
    public static boolean isPerfectNum(int num) {
        int sumOfFactors = 0;
        for(int factor = 1; factor < num; factor++) {
            sumOfFactors += (num % factor == 0) ? factor : 0;
        }
        return sumOfFactors == num;
    }
}