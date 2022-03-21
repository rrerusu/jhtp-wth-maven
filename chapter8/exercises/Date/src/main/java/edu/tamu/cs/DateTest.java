package edu.tamu.cs;

public class DateTest {
    public static void main(String args[]) {
        Date endOfYear = new Date(12, 31, 2021);

        System.out.printf("Date: %s", endOfYear);
        endOfYear.increment();
        System.out.printf("\nDate: %s", endOfYear);
    }
}