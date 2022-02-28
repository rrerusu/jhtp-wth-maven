package edu.tamu.cs;

import java.security.SecureRandom;

/**
 * Class that represents a deck of playing cards
 */
public class DeckOfCards {
    /**
     * Deck of playing cards
     */
   private Card[] deck;
   /**
    * Current card being viewed
    */
   private int currentCard;
   /**
    * Total number of cards in a deck
    */
   private static final int NUMBER_OF_CARDS = 52;
   /**
    * Random number generator
    */
   private static final SecureRandom randomNumbers = new SecureRandom();

   /**
    * Basic constructor
    */
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for(int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    /**
     * Shuffle deck of cards
     */
    public void shuffle() {
        currentCard = 0;

        for(int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    /**
     * Deal a card from the deck
     * @return A new card value
     */
    public Card dealCard() {
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}