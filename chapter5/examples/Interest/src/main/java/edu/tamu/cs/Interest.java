package edu.tamu.cs;

public class Interest {
    public static void main(String[] args) {
        double amount, principal = 1000.0, rate = 0.05;

        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        for(int year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f\n", year, amount);
        }
    }
}
