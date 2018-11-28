import java.util.*;
public class Player {
    //instance variables :/
    ArrayList<Card> hand = new ArrayList<Card>();
    String name;
    Scanner input = new Scanner(System.in);
    void chooseName(){
        System.out.println("what is your name?");
        name = input.next();
        System.out.println("odd choice of name. hello " + name);
        input.nextLine();
    }

    void showHand(){
        for (int i = 0; i <= hand.size(); i++){
            System.out.print(hand.get(i) + " ");
        }
    }

    void addCard(Card c){
        hand.add(c);
    }

    int calcHand(){
        int handVal = 0;
        boolean acePresent = false;
        for (int i = 0; i <= hand.size(); i++){
            if (hand.get(i).rank <= 10){
                handVal = hand.get(i).rank + handVal;
            } else {
                handVal = handVal + 10;
            }
            if (hand.get(i).rank == 1){
                acePresent = true;
            }
        }
        if ((handVal <= 11) && (acePresent == true)){
            handVal = 10 + handVal;
        }
        return handVal;
    }
}
