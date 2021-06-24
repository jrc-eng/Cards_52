/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMain;

import card52.Card;
import card52.Deck;
import imageGetter.CardImageGetter;
import java.io.File;
import javafx.scene.image.Image;

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
            
            File f = CardImageGetter.getFileFromCard(c);
            
            System.out.println(f.exists());
            
        }
        catch(Exception e)
        {
            System.out.println("Exception.  We couldn't get a card.");
        }
        
        
        
        
        
    }


}
