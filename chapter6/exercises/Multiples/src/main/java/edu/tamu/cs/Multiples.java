package edu.tamu.cs;

import java.util.Scanner;

/**
 * Determine whether a number is a multiple of another number.
 */
public class Multiples {
    /**
     * Main method to run program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, multiple;

        System.out.printf("Enter number: ");
        number = input.nextInt();
        System.out.printf("Enter number that might be a multiple: ");
        multiple = input.nextInt();

        System.out.printf("%d is%s a multiple of %d",
            multiple, (isMultiple(number, multiple) ? "" : "n't"), number);

        input.close();
    }

    /**
     * Test to see if the multiple is infact the multiple of the number
     * @param num The base number that the user enters
     * @param multiple The number that might or might not be a multiple
     * @return Boolean value whether or not the multiple is really a multiple of the number
     */
    public static boolean isMultiple(int num, int multiple) {
        return multiple % num == 0;
    }
}
