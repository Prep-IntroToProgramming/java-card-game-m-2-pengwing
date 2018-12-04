import java.util.*;
public class Deck{
    ArrayList<Card> cards = new ArrayList<Card>(); //make new arrayList of cards
    public Deck(){
        for (int suit = 1; suit < 5; suit++){ //nested "for" loops to make 13 cards in each rank and then go to the next rank until there's 52 cards 
            for (int rank = 1; rank < 14; rank++){
                cards.add(new Card(suit, rank)); //add new card wtih specified suit and rank
            }
        }
    }

    void shuffle(){ //the cards will be in number order by rank, so we need to make shuffle method
        Collections.shuffle(cards);
    }

    Card draw (){
        Card c = cards.get(0); //assign card c from the cards arrayList
        cards.remove(0); //remove this card from the arraylist
        return c; //now card c has the suit and rank that was just taken out of the arrayList
    }
}
