package edu.tamu.cs;

import java.util.EnumSet;

/**
 * Test the functionality of the book class
 */
public class EnumTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("All books:");

        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n",
                book, book.getTitle(), book.getCopyrightYear());

        System.out.printf("\nDisplay a range of enum constants:\n");

        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n",
                book, book.getTitle(), book.getCopyrightYear());
    }
}