package edu.tamu.cs;

import java.util.Scanner;

/**
 * Calculate input exponent power of input number
 * @author Ruk Erusu
 */
public class Exponentiation {
    /**
     * Main method: Get user input and return power
     * @param args Values entered through the command line.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int exp;

        System.out.printf("Enter base of expression: ");
        base = input.nextInt();
        System.out.printf("Enter exponent of expression: ");
        exp = input.nextInt();

        System.out.printf("%d to the power of %d is %d",
            base, exp, integerPower(base, exp));
        
        input.close();
    }

    /**
     * Evaluate exponent operation on given base
     * Assumptions:
     *      - exponent is positive non-zero number
     *      - base is integer
     * @param base The base value of the expression
     * @param exp The exponent vaue of the expression
     * @return The base to the power of the exponent
     */
    public static int integerPower(int base, int exp) {
        int power = 1;
        for(int multiple = 0; multiple < exp; multiple++)
            power *= base;
        
        return power;
    }
}