package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine whether a number is prime or not
 */
public class PrimeNumbers {
    /**
     * Main method to run code
     * @param args Command Line Arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.printf("Enter number: ");
        number = input.nextInt();

        System.out.printf("%d is%s prime.",
            number,
            (isPrime(number)) ? "" : "n't");

        input.close();
    }

    /**
     * Determine whether a number is prime or not
     * @param num Input number to be tested against
     * @return Whether or not a number is prime or not
     */
    public static boolean isPrime(int num) {
        for(int divisor = 2; divisor < (int) Math.sqrt(num) + 1 && isPrime(divisor); divisor++) {
            if(num % divisor == 0)
                return false;
        }
        return true;
    }
}