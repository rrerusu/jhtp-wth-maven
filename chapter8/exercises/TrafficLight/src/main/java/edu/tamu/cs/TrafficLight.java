package edu.tamu.cs;

public enum TrafficLight {
    GREEN(60.0),
    RED(60.0),
    YELLOW(6.0);

    /**
     * Amount of time that the traffic light displays that color
     */
    private final double duration;

    /**
     * Constructor that takes the duration of a color of light as a parameter
     * @param duration Amount of time a color will be displayed
     */
    TrafficLight(double duration) {
        this.duration = duration;
    }

    /**
     * Accessor method for the duration of time
     * @return The duration of time
     */
    public double getDuration() {
        return duration;
    }
}