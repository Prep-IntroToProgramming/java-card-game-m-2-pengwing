import java.util.*;
public class DeckTestDrive {
    public static void main(String[] args){
        Deck newDeck = new Deck(); //creates new deck from deck constructor
        System.out.println(newDeck.count()); //printing the size of the deck (should be 52)
        Card c = newDeck.draw(); // creates a new card c and sets it equal to the first card in the deck using the draw method
        System.out.println(c.rankToString() + " of " + c.suitToString()); 
        // draws the first card from the deck and prints out the cards suit and rank
        System.out.println(newDeck.count()); //print the size of the deck (should be 51 b/c removal of card using draw method) 
        newDeck.shuffle(); //shuffles the new deck
        Card c1 = newDeck.draw(); //creates another new card
        System.out.println(c1.rankToString() + " of " + c1.suitToString()); //prints out new card
                // should be different than first card 
        newDeck.discard(); // removes top card
        System.out.println(newDeck.count()); //prints out new size of deck using count method
                // should be 49, (2 draws and a discard reduce deck by 3 cards from 52 to 49)
    }
}