package edu.tamu.cs;

import java.util.Scanner;

/**
 * Display a square of asterisks with side length inputted by user
 */
public class AsteriskSquare {
    /**
     * Main method to run the code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.printf("Enter size of square: ");
        size = input.nextInt();

        System.out.printf("%s", genSquareOfAsterisks(size));

        input.close();
    }

    /**
     * Create a square of asterisks
     * @param size row and column of the square
     * @return A string containing the square of asterisks
     */
    public static String genSquareOfAsterisks(int size) {
        String square = "";

        for(int column = 0; column < size; column++) {
            for(int row = 0; row < size; row++) {
                square += "*";
            }
            square += "\n";
        }

        return square;
    }
}
