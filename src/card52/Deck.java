package card52;

import java.util.ArrayList;

import java.lang.Exception;

/**
 * Deck
 * 
 * Contains a Deck of 52 Cards (No Red or Black Jokers)
 * 
 * 52 cards total.
 * 13 Ranks.
 * 4 Suits.
 * 
 * The "top" of the deck is the first card.
 * 
 * The "bottom" of the deck is the last card.
 *
 * @author jrcro
 */
public class Deck {
    public final int CARDS_IN_DECK = 52;
    
    public final int RANKS = 13;
    
    public final int SUITS = 4;
    
    
    private ArrayList<Card> deck;
    
    public Deck()
    {
        deck = new ArrayList<Card>();
        
        initializeDeck();
    }
    
    /**
     * initializeDeck
     * 
     * Private Method to initialize the card deck with.
     * 
     * Initializes cards using a nested for loop.
     * Ranks, then suits.
     * 
     */
    private void initializeDeck(){
        
        //Start from Scratch.
        deck.clear();
        
        
        /*
        Strategy:
        Add Cards by suit, then rank.
        With this strategy, the Ace of Spades is First, the King of Clubs is Last.
        Just like a real life Card Deck you can get at a supermarket.
        
        */
        for (int s = 0 ; s < SUITS ; s++)
        {
            Suit currentSuit = Suit.SPADE;
            switch(s)
            {
                case 0: 
                    currentSuit = Suit.SPADE;
                break;
                case 1:
                    currentSuit = Suit.HEART;
                    break;
                case 2: 
                    currentSuit = Suit.DIAMOND;
                    break;
                case 3:
                    currentSuit = Suit.CLUB;
                    break;
            }
            
            //Nested for-loop:  Add cards by Rank.
            for (int r = 2 ; r <= RANKS ; r++)
            {
                deck.add(new Card(r, currentSuit));
            }
            
        }
        
        
    }
    
    
    /**
     * drawCard
     * 
     * Returns the card at the beginning of the card deck.
     * 
     * Throws an exception if the deck is empty.
     * 
     * 
     * @return Card
     * @throws Exception 
     */
    public Card drawCard() throws Exception
    {
        if(deck.isEmpty())
        {
            throw new Exception();
        }
        else
        {
            return deck.remove(0);
        }
    }
    
    /**
    * returnCard
    * 
    * Returns Card c back into the deck at the back.
    * 
    * 
    * 
    * @param c 
    */
    public void returnCard(Card c)
    {
        deck.add(c);
    }
    
}
