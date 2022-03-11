package edu.tamu.cs;

/**
 * Test the functionality of ths.
 */
public class ThisTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

/**
 * Time class to demonstrate this. functionality
 */
class SimpleTime {
    /**
     * Hour part of the time
     */
    private int hour;
    /**
     * Minute part of the time
    */
    private int minute;
    /**
     * Second part of the time
     */
    private int second;

    /**
     * Constructor that takes 3 arguments
     * @param hour Hour part of the time
     * @param minute Minute part of the time
     * @param second Second part of the time
     */
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Compare the functionalities between using this. and not using this.
     * @return A comparison between using this. and not using this.
     */
    public String buildString() {
        return String.format("%24s: %s\n%24s: %s",
            "this.toUniversalString()", this.toUniversalString(),
            "toUniversalString()", toUniversalString());
    }

    /**
     * Create a String for current time
     * @return A String that represents the current time
     */
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",
            this.hour, this.minute, this.second);
    }
}