package edu.tamu.cs;

/**
 * Define 2 classes within same file
 */
public class PackageDataTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        System.out.printf("After instantiation:\n%s\n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("\nAfter changing values:\n%s\n", packageData);
    }
}

/**
 * Class that represents a number and string
 */
class PackageData {
    /**
     * Number component of PackageData object
     */
    int number;
    /**
     * String component of PackageData object
     */
    String string;

    /**
     * Constructor for package data object
     */
    public PackageData() {
        number = 0;
        string = "Hello";
    }

    /**
     * Return String representation of this object
     * @return String representation of this object
     */
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}