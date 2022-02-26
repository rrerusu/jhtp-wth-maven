package edu.tamu.cs;

/**
 * Displays numbers and their binary, octal and hexadecimal equivalents in a
 * table
 */
public class BaseTables {
    /**
     * Main method for code to run
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.print(toBinary(63));
    }

    /**
     * Convert a decimal number to its binary equivalent
     * @param base10Num a decimal number
     * @return the decimal number's binary equivalent
     */
    public static int toBinary(int base10Num) {
        int binary = 0, size = 1;

        // Calculate size of binary number
        while(Math.pow(2, size) <= base10Num) {
            size++;
        }
        
        // Convert decimal number to binary equivalent
        for(int counter = 0; counter < size; counter++) {
            binary += (base10Num / (int)Math.pow(2, size - (counter + 1))) *
                (int)Math.pow(10, size - (counter + 1));
            base10Num %= Math.pow(2, size - (counter + 1));
        }

        return binary;
    }
}
