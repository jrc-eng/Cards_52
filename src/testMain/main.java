/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMain;

import card52.Card;
import card52.Deck;

/**
 *
 * @author jrcro
 */
public class main {
    
    public static void main(String [] args)
    {
        Deck d = new Deck();
        d.shuffle();
        
        try{
            Card c = d.drawCard();
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception.  We couldn't get a card.");
        }
        
        
        
        
    }
}
