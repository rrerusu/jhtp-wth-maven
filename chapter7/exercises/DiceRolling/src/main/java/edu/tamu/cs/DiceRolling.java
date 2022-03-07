package edu.tamu.cs;

import java.security.SecureRandom;

/**
 * Exercise 07 - 17
 * Determine the odds of getting the sum of two dice
 */
public class DiceRolling {
    /**
     * The number of sides a die has
     */
    private static int DIE_SIDES = 6;
    /**
     * Number of rolls that we are completing
     */
    private static int NUM_ROLLS = 3600000;
    /**
     * Random number generator
     */
    private static final SecureRandom randomNumbers = new SecureRandom();

    /**
     * Main method to run the code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        printProbability(collectData());
    }

    /**
     * Generate list of random dice rolls
     * @return 2 dimensional array of dice sums
     */
    public static int[][] collectData() {
        int[][] sums = new int[DIE_SIDES][DIE_SIDES];
        for(int counter = 0; counter < NUM_ROLLS; counter++)
            sums[randomNumbers.nextInt(DIE_SIDES)][randomNumbers.nextInt(DIE_SIDES)]++;
        return sums;
    }
    
    /**
     * Print a table of the total number of times a sum was calculated
     * and the percentage of the time that it occurs
     * @param die1
     * @param die2
     */
    public static void printProbability(int[][] sums) {
        for(int row = 0; row <= DIE_SIDES; row++) {
            for(int col = 0; col <= DIE_SIDES; col++) {
                if(row == 0)
                    System.out.printf("   %s   |", "" + col);
                else if(col == 0)
                    System.out.printf("   %s   |", "" + row);
                else
                    System.out.printf(" %.2f%% |", 100.0 * sums[row - 1][col - 1] / NUM_ROLLS);
            }
            System.out.println();
        }
    }
}