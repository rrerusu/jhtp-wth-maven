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
        int num = 63;
        // System.out.println(toBinary(num));
        // System.out.println(toOctal(num));
        // System.out.println(toHex(num));
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
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

    /**
     * Convert a decimal number to its hexadecimal equivalent
     * @param base10Num a decimal number
     * @return the decimal number's hexadecimal equivalent
     */
    public static String toHex(int base10Num) {
        String hex = "";
        int size = 1;

        // Calculate size of binary number
        while(Math.pow(16, size) <= base10Num) {
            size++;
        }
        
        // Convert decimal number to binary equivalent
        for(int counter = 0; counter < size; counter++) {
            int digit = base10Num / (int)Math.pow(16, size - (counter + 1));
            hex += (digit < 10) ? Integer.toString(digit) : (char)((int)'A' + (digit - 10));
            base10Num %= Math.pow(16, size - (counter + 1));
        }

        return hex;
    }

    /**
     * Convert a decimal number to its octal equivalent
     * @param base10Num a decimal number
     * @return the decimal number's octal equivalent
     */
    public static int toOctal(int base10Num) {
        int octal = 0, size = 1;

        // Calculate size of binary number
        while(Math.pow(8, size) <= base10Num) {
            size++;
        }
        
        // Convert decimal number to binary equivalent
        for(int counter = 0; counter < size; counter++) {
            octal += (base10Num / (int)Math.pow(8, size - (counter + 1))) *
                (int)Math.pow(10, size - (counter + 1));
            base10Num %= Math.pow(8, size - (counter + 1));
        }

        return octal;
    }
}
