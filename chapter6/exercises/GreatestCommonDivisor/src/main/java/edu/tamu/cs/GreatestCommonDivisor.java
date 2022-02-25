package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine the greatest common divisor of 2 numbers
 */
public class GreatestCommonDivisor {
    /**
     * Main method to run java code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.printf("Enter first number: ");
        num1 = input.nextInt();
        System.out.printf("Enter second number: ");
        num2 = input.nextInt();

        System.out.printf("GCD of %d and %d is %d.",
            num1, num2, calcGCD(num1, num2)    
        );

        input.close();
    }

    /**
     * Determine the GCD of 2 numbers
     * @param num1 first number inputted by user
     * @param num2 second number inputed by user
     * @return
     */
    public static int calcGCD(int num1, int num2) {
        int gcd = 0;
        for(int counter = 2; counter <= num1; counter++) {
            if(num1 % counter == 0 && num2 % counter == 0)
                gcd = counter;
        }
        return gcd;
    }
}
