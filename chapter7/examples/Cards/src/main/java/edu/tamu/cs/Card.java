package edu.tamu.cs;

/**
 * Class that represents a playing card
 */
public class Card {
    /**
     * Face of the playing card
     */
    private final String face;
    /**
     * Suit of the playing card
     */
    private final String suit;

    /**
     * 2 Argument constructor to initialize Card
     * @param cardFace Face of the card
     * @param cardSuit Suit of the cardd
     */
    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    /**
     * Convert this card object to a string
     * @return A string that describes this card object
     */
    public String toString() {
        return face + " of " + suit;
    }
}
