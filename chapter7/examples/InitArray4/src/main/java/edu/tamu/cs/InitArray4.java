package edu.tamu.cs;

/**
 * Test functionalities of 2 dimensional arrays
 */
public class InitArray4 {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);
        
        System.out.println("\nValues in array2 by row are");
        outputArray(array2);
    }

    /**
     * Print the values in a 2 dimensional array
     * @param array any 2 dimensional array
     */
    public static void outputArray(int[][] array) {
        for(int row = 0; row < array.length; row++) {
            for(int column = 0; column < array[row].length; column++)
                System.out.printf("%d\t", array[row][column]);
            
            System.out.println();
        }
    }
}
