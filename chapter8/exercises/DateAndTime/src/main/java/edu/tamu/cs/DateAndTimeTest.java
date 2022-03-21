package edu.tamu.cs;

/**
 * Test the functionality of Date and Time together
 */
public class DateAndTimeTest {
    /**
     * Main method to run code
     * @param args 
     */
    public static void main(String[] args) {
        DateAndTime myInfo = new DateAndTime(12, 31, 2021, new Time2(23, 59, 59));
        
        System.out.printf("Date and time: %s", myInfo.toString());
        myInfo.increment();
        System.out.printf("\nDate and time: %s", myInfo.toString());
    }
}