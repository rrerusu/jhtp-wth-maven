package edu.tamu.cs;

import java.util.ArrayList;

/**
 * Testing functionality of ArrayLists
 */
public class ArrayListCollection {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print(
            "Display list contents with counter-controlled loop:"
        );

        for(int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));
        
        display(items,
            "\nDisplay list contents with enhanced for statment:");
        
        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("yellow");
        display(items, "Remove first instance of yellow:");

        items.remove(1);
        display(items, "Remove second list element(green):");

        System.out.printf("\"red\" s %sin the list\n",
            items.contains("red") ? "" : "not ");

        System.out.printf("Size: %s\n", items.size());
    }

    /**
     * Display ArrayList values with a header description
     * @param items ArrayList values that will be printed
     * @param header Header to describe what the ArrayList values mean
     */
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header);

        for(String item : items)
            System.out.printf(" %s", item);
        
        System.out.println();
    }
}
