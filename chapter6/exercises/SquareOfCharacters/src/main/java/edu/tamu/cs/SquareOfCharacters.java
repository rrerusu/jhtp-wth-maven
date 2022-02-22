package edu.tamu.cs;

import java.util.Scanner;

/**
 * Display a square of characters with side length and charactes inputted by user
 */
public class SquareOfCharacters {
    /**
     * Main method to run the code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character;
        int size;

        System.out.printf("Enter size of square: ");
        size = input.nextInt();
        System.out.printf("Enter character to be used for square: ");
        character = input.next().charAt(0);

        System.out.printf("%s", genSquareOfCharacters(size, character));

        input.close();
    }

    /**
     * Create a square of characters
     * @param character character that will be printed 
     * @param size row and column of the square
     * @return A string containing the square of asterisks
     */
    public static String genSquareOfCharacters(int size, char character) {
        String square = "";

        for(int column = 0; column < size; column++) {
            for(int row = 0; row < size; row++) {
                square += character;
            }
            square += "\n";
        }

        return square;
    }
}
