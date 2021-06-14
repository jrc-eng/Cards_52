/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card52;

/**
 *
 * @author jrcro
 */
public class Deck {
    public final int CARDS_IN_DECK = 52;
    
    public final int RANKS = 13;
    
    public final int SUITS = 4;
    
    
    private Card [] deck;
    
    public Deck()
    {
        deck = new Card[52];
        
        initializeDeck();
    }
    
    private void initializeDeck(){
        
        
        
    }
}
