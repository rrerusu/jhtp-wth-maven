package edu.tamu.cs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 07 - 12
 * Get 5 numbers from the user and test to see values are duplicated
 */
public class DuplicateElimination {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];
        int counter = 0;

        while(values[4] == 0) {
            System.out.printf("Enter a value between 10 and 100: ");
            int inputNum = input.nextInt();
            if(!valExists(inputNum, values)) {
                System.out.println(inputNum);
                values[counter] = inputNum;
                counter++;
                displayArr(values);
            } else
                System.out.println("Number exists in array.");
        }

        input.close();
    }

    /**
     * Display the values in an int array
     * @param arr int array
     */
    public static void displayArr(int[] arr) {
        String values = "[";
        for(int val : arr)
            values += val + " ";
        System.out.printf("%s]\n", values.trim());
    }

    /**
     * Determine whether a number exists in an array
     * @param num Value that might exist in array
     * @param arr Array that might have Value
     * @return The index of the element in the array
     */
    public static boolean valExists(int num, int[] arr) {
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] == num)
                return true;
        }
        return false;
    }
}