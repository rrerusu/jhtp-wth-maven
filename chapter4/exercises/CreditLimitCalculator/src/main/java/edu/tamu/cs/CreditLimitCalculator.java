package edu.tamu.cs;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNum, balance, beginningBalance, creditLimit, totalItemCost, totalCredits;

        // Get user inputs
        System.out.printf("Enter account number: ");
        accountNum = input.nextInt();
        System.out.printf("Enter the balance of the account at the beginning of the month: ");
        beginningBalance = input.nextInt();
        System.out.printf("Enter the total cost of all items charged from beginning of month: ");
        totalItemCost = input.nextInt();
        System.out.printf("Enter the amount that all of your credits come out to: ");
        totalCredits = input.nextInt();
        System.out.printf("Enter credit limit: ");
        creditLimit = input.nextInt();

        balance = beginningBalance - totalItemCost - totalCredits;

        if(balance > creditLimit)
            System.out.printf("Credit limit exceeded");
        else
            System.out.printf("New balance for account %d is %d", accountNum, balance);

        input.close();
    }
}