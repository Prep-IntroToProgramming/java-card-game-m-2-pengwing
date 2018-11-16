import java.util.*;
public class Deck{
    public Deck(){
        ArrayList<Card> myDeck = new ArrayList<Card>();
        for (int i = 0; i < 14; i++){
            Card myCard = new Card(i, i);
            myDeck.add(myCard);
        }
    }
}