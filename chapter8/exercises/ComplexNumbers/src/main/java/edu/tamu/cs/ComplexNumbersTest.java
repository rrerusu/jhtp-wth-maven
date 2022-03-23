package edu.tamu.cs;

/**
 * Driver class for ComplexNumbers class
 */
public class ComplexNumbersTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber();
        ComplexNumber num2 = new ComplexNumber(10, 5);

        System.out.printf("num1: %s\nNum2: %s\n\n", num1, num2);
        System.out.printf("num1 + num2 = %s\nnum1 - num2 = %s",
            ComplexNumber.add(num1, num2), ComplexNumber.subtract(num1, num2));
    }
}
