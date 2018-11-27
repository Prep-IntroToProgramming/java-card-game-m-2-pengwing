import java.util.*;
public class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();
    int cardValue = 0;
    public Deck(){
        for (int suit = 1; suit < 5; suit++){
            for (int rank = 1; suit < 14; rank++){
                Card myCard = new Card(suit, rank);
                cards.add(myCard);
            }
        }
    }

    void shuffle(){
        
    }

    void draw (){
        cards.get(cardValue);
        cardValue++;
    }
}