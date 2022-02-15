package edu.tamu.cs;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNum, numInts, smallest;

        System.out.printf("Enter the number of integers you would like to enter: ");
        numInts = input.nextInt();

        System.out.printf("Enter number: ");
        smallest = input.nextInt();

        for(int counter = 0; counter < numInts; counter++) {
            System.out.printf("Enter number: ");
            inputNum = input.nextInt();
            smallest = (smallest > inputNum) ? inputNum : smallest;
        }

        System.out.printf("Smallest number entered is %d.", smallest);

        input.close();
    }
}
