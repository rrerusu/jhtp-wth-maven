package edu.tamu.cs;

/**
 * Time in 24 hour format
 */
public class Time1 {
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
     * Almost constructor, with a test case
     * @param hour Hour part of the time
     * @param minute Minute part of the time
     * @param second Second part of the time
     */
    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
            second < 0 || second >= 60)
            throw new IllegalArgumentException(
                "hour, minute, and/or second was out of range"
            );
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Dislay the time as in 24 hour format
     * @return The time separated by colons as a String
     */
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /**
     * Create a String of the time in 12 hour format
     * @return A string of the time in a 12 hour format
     */
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            (hour == 0 || hour == 12) ? 12 : hour % 12,
            minute, second, (hour < 12 ? "AM" : "PM"));
    }
}