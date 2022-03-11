package edu.tamu.cs;

/**
 * Test access modifiers
 */
public class MemberAccessTest {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Time1 time = new Time1();

        time.hour = 7;
        time.minute = 15;
        time.second = 30;
    }
}