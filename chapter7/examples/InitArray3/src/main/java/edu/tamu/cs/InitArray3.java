package edu.tamu.cs;

/**
 * Calculate values that will be placed into the elements of an array
 */
public class InitArray3 {
    /**
     * Main function to run java code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for(int counter = 0; counter < array.length; counter++)
            array[counter] = 2 * 2 + counter;
        
        System.out.printf("%s%8s\n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++)
            System.out.printf("%5s%8s\n", counter, array[counter]);
    }
}
