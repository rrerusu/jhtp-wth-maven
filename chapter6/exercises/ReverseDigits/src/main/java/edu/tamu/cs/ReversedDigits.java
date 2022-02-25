package edu.tamu.cs;

import java.util.Scanner;

/**
 * Reverse digits of number
 */
public class ReversedDigits {
    /**
     * Main method to run program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.printf("Enter number: ");
        number = input.nextInt();

        System.out.printf("%d reversed is %d.",
            number, reverseDigits(number));

        input.close();
    }

    /**
     * Reverse digits of given number
     * @param num Input number
     * @return Reverse of number inputted
     */
    public static int reverseDigits(int num) {
        int digits = 1,
            reverseNum = 0;
        
        // Determine the size of input num
        while(num / (int)Math.pow(10, digits) > 0) {
            digits++;
        }

        // Reverse number
        for(int digit = 0; digit < digits; digit++) {
            reverseNum += Math.pow(10, digit) * (int)(num / Math.pow(10, digits - (digit + 1)));
            num %= Math.pow(10, digits - (digit + 1));
        }

        return reverseNum;
    }
}
