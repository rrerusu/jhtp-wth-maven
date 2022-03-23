package edu.tamu.cs;

public class ComplexNumber {
    /**
     * Imaginary component of complex number
     */
    private double imag;
    /**
     * Real component of complex number
     */
    private double real;

    /**
     * Default constructor
     */
    public ComplexNumber() {
        real = 0;
        imag = 0;
    }

    /**
     * Over loaded constructor that takes 2 arguments
     * @param real Real component of complex number
     * @param imag Imaginary component of complex number
     */
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Add 2 complex numbers together
     * @param num1 First complex number that will be added
     * @param num2 Second complex number that will be added
     * @return The sum of both complex numbers
     */
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(
            num1.getReal() + num2.getReal(),
            num1.getImaginary() + num2.getImaginary()
        );
    }

    /**
     * Subtract 2 complex numbers together
     * @param num1 First complex number
     * @param num2 Second complex number that will be subtracted from num1
     * @return The difference of both complex numbers
     */
    public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(
            num1.getReal() - num2.getReal(),
            num1.getImaginary() - num2.getImaginary()
        );
    }

    /**
     * Accessor method for imaginary component of complex number
     * @return Imaginary component of complex number
     */
    public double getImaginary() {
        return imag;
    }

    /**
     * Accessor method for real component of complex number
     * @return Real component of complex number
     */
    public double getReal() {
        return real;
    }

    /**
     * Modifier method for imaginary compnent of complex number
     * @param imag Imaginary component of complex number
     */
    public void setImaginary(double imag) {
        this.imag = imag;
    }

    /**
     * Modifier method for real component of complex number
     * @param real Real component of complex number
     */
    public void setReal(double real) {
        this.real = real;
    }

    public String toString() {
        return String.format("%.2f %s %.2fi", real,
            (imag < 0) ? "-" : "+", imag);
    }
}