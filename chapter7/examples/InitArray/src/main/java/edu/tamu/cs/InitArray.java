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
        if(args.length != 3)
            System.out.printf(
                "Error: Please re-enter the entire command, including \n" +
                "an array size, initial value and increment.\n");
        else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[10];

            System.out.printf("%s%8s\n", "Index", "Value");

            for(int counter = 0; counter < arrayLength; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}
