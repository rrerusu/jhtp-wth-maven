package edu.tamu.cs;

public class Rational {
    /**
     * Denominator component of this rational object
     */
    private int denominator;
    /**
     * Numerator component of this rational object
     */
    private int numerator;

    /**
     * Constructor that takes values for nuerator and denominators
     * @param numerator Numerator component of this rational object
     * @param denominator Denominator component of this rational object
     */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    /**
     * Add 2 rational numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The sum of 2 Rational object
     */
    public static Rational add(Rational num1, Rational num2) {
        return new Rational(
            num1.getNumerator() * num2.getDenominator() + 
            num2.getNumerator() * num1.getDenominator(),
            num1.getDenominator() * num2.getDenominator()
        );
    }

    /**
     * Calculate the GCF of 2 numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The GCF of both numbers
     */
    public int calcGCF(int num1, int num2) {
        int gcf = 1;
        for(int testNum = 2; testNum <= Math.min(num1, num2); testNum++) {
            if(num1 % testNum == 0 && num2 % testNum == 0)
                gcf = testNum;
        }
        return gcf;
    }

    /**
     * Divide 2 rational numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The quotient of 2 Rational object
     */
    public static Rational divide(Rational num1, Rational num2) {
        return new Rational(
            num1.getNumerator() * num2.getDenominator(),
            num1.getDenominator() * num2.getNumerator()
        );
    }

    /**
     * Accessor method for denominator component of rational object
     * @return Denominator component of rational object
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Accessor method for numerator component of rational object
     * @return Numerator component of rational object
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Multiply 2 rational numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The product of 2 Rational object
     */
    public static Rational multiply(Rational num1, Rational num2) {
        return new Rational(
            num1.getNumerator() * num2.getNumerator(),
            num1.getDenominator() * num2.getDenominator()
        );
    }

    /**
     * Reduce this rational object the the lowest possible values
     */
    public void reduce() {
        int gcf = calcGCF(numerator, denominator);
        numerator = numerator / gcf;
        denominator = denominator / gcf;
    }

    /**
     * Modifier method for denominator component of rational object
     * @param denominator Denominator component of rational object
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        reduce();
    }

    /**
     * Modifier method for numerator component of rational object
     * @param numerator Numerator component of rational object
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    /**
     * Subtract 2 rational numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The Difference of 2 Rational object
     */
    public static Rational subtract(Rational num1, Rational num2) {
        return new Rational(
            num1.getNumerator() * num2.getDenominator() - 
            num2.getNumerator() * num1.getDenominator(),
            num1.getDenominator() * num2.getDenominator()
        );
    }

    /**
     * Create string representation of this rational number as a decimal
     * @return String representation of this rational number as a decimal
     */
    public String toStringDecimal() {
        return String.format("%f", numerator * 1.0 / denominator);
    }

    /**
     * Create string representation of this rational number as a fraction
     * @return String representation of this rational number as a fraction
     */
    public String toStringFraction() {
        return String.format("%d/%d", numerator, denominator);
    }
}