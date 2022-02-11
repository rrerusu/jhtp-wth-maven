package edu.tamu.cs;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gallons = 0, miles = 0, totalGallons = 0, totalMiles = 0;

        while(gallons != -1 && miles != -1) {
            System.out.printf("Enter miles driven: ");
            miles = input.nextInt();

            if(miles != -1) {
                System.out.printf("Enter gallons driven: ");
                gallons = input.nextInt();

                if(gallons != -1) {
                    totalMiles += miles;
                    totalGallons += gallons;
                    System.out.printf("MPG for this trip was %.2f\n\n", (1.0 * miles) / gallons);
                }
            }
        }

        if(totalGallons == 0 || totalMiles == 0)
            System.out.printf("Exiting program.");
        else
            System.out.printf("Total miles for all trips: %d\nTotal gallons for all trips: %d\nTotal MPG: %.2f",
                totalMiles, totalGallons, (totalMiles * 1.0) / totalGallons);

        input.close();
    }
}
