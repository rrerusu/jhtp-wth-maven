package edu.tamu.cs;

/**
 * Driver class for Rational class
 */
public class RationalTest {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Rational num1 = new Rational(13, 26);
        Rational num2 = new Rational(3, 9);

        // Print out values
        System.out.printf("%s\n%s\n\n",
            num1.toStringFraction(),
            num2.toStringFraction());
        
        // Apply basic mathematical operations on both radical values
        System.out.printf("%s + %s = %s\n",
            num1.toStringFraction(), num2.toStringFraction(),
            Rational.add(num1, num2).toStringFraction());
        System.out.printf("%s - %s = %s\n",
            num1.toStringFraction(), num2.toStringFraction(),
            Rational.subtract(num1, num2).toStringFraction());
        System.out.printf("%s * %s = %s\n",
            num1.toStringFraction(), num2.toStringFraction(),
            Rational.multiply(num1, num2).toStringFraction());
        System.out.printf("%s / %s = %s\n\n",
            num1.toStringFraction(), num2.toStringFraction(),
            Rational.divide(num1, num2).toStringFraction());

        // Print decimal and fractional versions of radicals
        System.out.printf("Num1 fraction: %s\nNum1 decimal: %s\n",
            num1.toStringFraction(), num1.toStringDecimal());
        System.out.printf("Num2 fraction: %s\nNum2 decimal: %s",
            num2.toStringFraction(), num2.toStringDecimal());
    }
}
