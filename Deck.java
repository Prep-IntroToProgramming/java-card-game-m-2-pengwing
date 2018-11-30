import java.util.*;
public class Deck{
    ArrayList<Card> cards = new ArrayList<Card>();
    public Deck(){
        
        for (int suit = 1; suit < 5; suit++){
            for (int rank = 1; suit < 14; rank++){
                //Card myCard = new Card(suit, rank);
                cards.add(new Card(suit, rank));
            }
        }
    }

    void shuffle(){
        Collections.shuffle(cards);
    }

    Card draw (){
        Card c = cards.get(0);
        cards.remove(0);
        return c;
    }
}