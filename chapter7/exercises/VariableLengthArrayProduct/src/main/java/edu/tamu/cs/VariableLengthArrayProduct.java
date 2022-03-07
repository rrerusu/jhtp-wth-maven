package edu.tamu.cs;

import java.util.Scanner;

/**
 * Calculate the product of an array with unknown length
 */
public class VariableLengthArrayProduct {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums;

        System.out.print("Enter the length of the array: ");
        nums = new int[input.nextInt()];

        for(int index = 0; index < nums.length; index++) {
            System.out.printf("Enter num %d: ", index + 1);
            nums[index] = input.nextInt();
        }

        System.out.printf("Product of nums entered is %d.", calcProduct(nums));

        input.close();
    }

    /**
     * Calculate the product of the numbers in an array
     * @param arr An int array being passed
     * @return The sum of the values in the array
     */
    public static int calcProduct(int[] arr) {
        int product = 1;
        for(int index = 0; index < arr.length; index++)
            product *= arr[index];
        
        return product;
    }
}
