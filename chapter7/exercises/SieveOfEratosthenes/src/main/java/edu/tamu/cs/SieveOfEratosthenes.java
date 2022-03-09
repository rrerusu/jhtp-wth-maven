package edu.tamu.cs;

import java.util.Arrays;

/**
 * Determine prime numbers
 */
public class SieveOfEratosthenes {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        boolean[] primeNumbers = new boolean[100];
        Arrays.fill(primeNumbers, Boolean.TRUE);

        for(int index = 1; index < primeNumbers.length; index++)
            if(primeNumbers[index])
                for(int counter = 2 * index + 1; counter < primeNumbers.length; counter += index + 1)
                    primeNumbers[counter] = false;
            
        for(int index = 0; index < primeNumbers.length; index++)
            if(primeNumbers[index])
                System.out.printf("%d ", index + 1);
    }
}