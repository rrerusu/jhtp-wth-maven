package edu.tamu.cs;

import static java.lang.Math.*;

/**
 * Static import test
 */
public class StaticImportTest {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f\n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f\n", ceil(-9.8));
        System.out.printf("E = %f\n", E);
        System.out.printf("PI = %f\n", PI);
    }
}
