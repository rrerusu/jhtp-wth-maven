package edu.tamu.cs;

/**
 * Shuffle and deal cards
 */
public class DeckOfCardsTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for(int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if(i % 4 == 0)
                System.out.println();
        }
    }
}