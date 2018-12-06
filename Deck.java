import java.util.*;
public class Deck{
    ArrayList<Card> cards = new ArrayList<Card>(); //make new arrayList of cards
    public Deck(){
        /* nested "for" loops to make 13 cards in each 
         * rank and then go to the next rank until there's 52 cards
         */
        for (int suit = 1; suit < 5; suit++){  
            for (int rank = 1; rank < 14; rank++){
                cards.add(new Card(suit, rank)); //add new card wtih specified suit and rank
            }
        }
    }

    void shuffle(){ 
        /*the cards will be in number order by rankso we need 
         * to make shuffle method to randomize the order
         */
        Collections.shuffle(cards);
    }

    Card draw (){
        Card c = cards.get(0); //assign card c from the cards arrayList
        cards.remove(0); //remove this card from the arraylist
        return c; //return the card to be used by the add method in the player class
    }

    int count(){
        //method that counts the amount of cards in the deck and returns the size
        return cards.size();
    }

    void discard(){
        //discard method that removes the first card from the deck
        Card c = cards.get(0);
        cards.remove(0);
    }
}
