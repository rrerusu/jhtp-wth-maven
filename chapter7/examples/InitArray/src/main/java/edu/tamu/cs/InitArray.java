package edu.tamu.cs;

/**
 * Initialize the elements of an array to default values of zero
 */
public class InitArray {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }
}
