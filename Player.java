import java.util.*;
public class Player {
    //instance variables :/
    ArrayList<Card> hand = new ArrayList<Card>();
    String name = "potato";
    void chooseName(){
        //bonus
    }

    void showHand(){
        for (int i = 0; i <= hand.size(); i++){
            System.out.print(hand.get(i) + " ");
        }
    }

    void addCard(Card c){
        hand.add(c);
    }

    //int calcHand(){
       // int handVal = 0;
       // boolean acePresent = false;
    }
