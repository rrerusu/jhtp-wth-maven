package edu.tamu.cs;

import java.util.EnumSet;

/**
 * Driver file for TrafficLight
 */
public class TrafficLightTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%-10s%-20s\n", "Color", "Duration");

        for(TrafficLight color : EnumSet.range(TrafficLight.GREEN, TrafficLight.YELLOW)) {
            System.out.printf("%-10s%-20.2f\n", color, color.getDuration());
        }
    }   
}
