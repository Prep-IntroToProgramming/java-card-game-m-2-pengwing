import java.util.*;
public class DeckTestDrive {
    public static void main(String[] args){
       Deck newDeck = new Deck();
       newDeck.shuffle();
       System.out.println(newDeck.cards.size());
    }
}