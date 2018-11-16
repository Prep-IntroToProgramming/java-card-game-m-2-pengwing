import java.util.*;
public class Deck{
    public Deck(){
        ArrayList<Card> myDeck = new ArrayList<Card>();
        for (int suit = 1; suit < 5; suit++){
            for (int rank = 1; suit < 14; rank++){
                Card myCard = new Card(suit, rank);
                myDeck.add(myCard);
            }
        }
    }
}