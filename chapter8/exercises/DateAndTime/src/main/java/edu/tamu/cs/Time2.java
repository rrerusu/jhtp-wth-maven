package edu.tamu.cs;

/**
 * Time class with multiple constructors
 */
public class Time2 {
    /**
     * Hour component of the time
     */
    private int hour;
    /**
     * Minute component of the time
     */
    private int minute;
    /**
     * Second component of the time
     */
    private int second;

    /**
     * Basic constructor with no arguments
     */
    public Time2() {
        this(0, 0, 0);
    }

    /**
     * Constructor with hour as an argument
     * @param hour Hour component of the time
     */
    public Time2(int hour) {
        this(hour, 0, 0);
    }

    /**
     * Constructor with hour and minute as arguments
     * @param hour Hour component of the time
     * @param minute Minute component of the time
     */
    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    /**
     * Constructor with hour, minute, and second as arguments
     * @param hour Hour component of the time
     * @param minute Minute component of the time
     * @param second Second component of the time
     */
    public Time2(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
    
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Constructor with Time2 object as argument
     * @param time Time2 object
     */
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    /**
     * Set the time with hour, minute, and second parameters
     * @param hour Hour component of the time
     * @param minute Minute component of the time
     * @param second Second component of the time
     */
    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
    
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Accessor method for hour component
     * @return hour component of the time
     */
    public int getHour() {
        return hour;
    }

    /**
     * Accessor method for minute component
     * @return minute component of the time
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Accessor method for second component
     * @return second component of the time
     */
    public int getSecond() {
        return second;
    }

    /**
     * Increment time up by 1 second
     */
    public void increment() {
        try {
            setSecond(getSecond() + 1);
        } catch(IllegalArgumentException invalidSecond) {
            setSecond(0);
            try {
                setMinute(getMinute() + 1);
            } catch(IllegalArgumentException invalidMinute) {
                setMinute(0);
                setHour((getHour() + 1) % 24);
            }
        }
    }

    /**
     * Modifier method for hour component
     * @param hour Hour component of the time
     */
    public void setHour(int hour) {
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        this.hour = hour;
    }

    /**
     * Modifier method for minute component
     * @param minute Minute component of the time
     */
    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        this.minute = minute;
    }

    /**
     * Modifier method for second component
     * @param second Second component of the time
     */
    public void setSecond(int second) {
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.second = second;
    }

    /**
     * Create a string that represents the time in 24 hour format
     * @return String that represents time in 24 Hour format
     */
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",
            getHour(), getMinute(), getSecond());
    }

    /**
     * Create a string that represents the time in 12 - Hour format
     * @return String that represents time in 12 Hour format
     */
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
