package edu.tamu.cs;

/**
 * Combine both Date and Time2 classes in 1 class
 */
public class DateAndTime {
    /**
     * Date component of DateAndTime object
     */
    private Date date;
    /**
     * Time component of DateAndTime object
     */
    private Time2 time;

    /**
     * Constructor that takes date and time
     * @param month Month compnent of date
     * @param day Day component of date
     * @param year Year component of date
     * @param someTime Time component of DateAndTime
     */
    public DateAndTime(int month, int day, int year, Time2 someTime) {
        date = new Date(month, day, year);
        time = new Time2(someTime);
    }

    public void increment() {
        time.increment();
        if(time.getHour() == 0 &&
            time.getMinute() == 0 &&
            time.getSecond() == 0)
            date.increment();
    }

    /**
     * String representation of this DateAndTime object
     * @return String representation of this DateAndTime object
     */
    public String toString() {
        return String.format("%s %s",
            date.toString(), time.toString());
    }
}
