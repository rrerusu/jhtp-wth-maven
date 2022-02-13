package edu.tamu.cs;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sales = 0, currentSale = 0;

        while(currentSale > -1) {
            System.out.printf("Enter value of sold item (-1 to leave): ");
            currentSale = input.nextDouble();
            sales += (currentSale > -1) ? currentSale * 0.09 : 0;
        }

        System.out.printf("Salary: %.2f", sales);

        input.close();
    }
}