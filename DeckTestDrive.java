import java.util.*;
public class DeckTestDrive {
    public static void main(String[] args){
        Deck newDeck = new Deck(); //creates new deck from deck constructor
        //newDeck.shuffle(); //shuffles the new deck
        System.out.println(newDeck.count()); //printing the size of the deck
        //newDeck.discard(); //removes top card from deck
        // System.out.println(newDeck.count()); //prints out new size of deck using count method
        Card c = newDeck.draw(); 
        // creates a new card c and sets it equal to the first card in the deck using the draw method
        System.out.println(newDeck.draw().rankToString() + " of " + newDeck.draw().suitToString()); 
        // draws the first card from the deck and prints out the 
    }
}