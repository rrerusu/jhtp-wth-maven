package edu.tamu.cs;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before postincrement: %d\n", c);
        System.out.printf("     postincrementing c: %d\n", c++);
        System.out.printf(" c after postincrement: %d\n\n", c);

        c = 5;
        System.out.printf("c before preincrement: %d\n", c);
        System.out.printf("     preincrement c: %d\n", ++c);
        System.out.printf(" c after preincrement: %d\n\n", c);
    }
}
