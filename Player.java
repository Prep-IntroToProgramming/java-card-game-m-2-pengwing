import java.util.*;
public class Player {
    //instance variables
    ArrayList<Card> hand = new ArrayList<Card>(); //creates a new arraylist of cards called hand
    String name;
    Scanner input = new Scanner(System.in);
    /* lets user choose name
     * yeet
     */
    void chooseName(){
        System.out.println("what is your name?");
        name = input.next();
        System.out.println("odd choice of name. hello " + name);
        input.nextLine();
    }

    /*
     * prints out the players hand
     *      prints cards in the hand on a separate line 
     *      using an enhanced for loop
     */
    void showHand(){
        for (Card x: hand){
            System.out.println(x.rankToString() + " of " + x.suitToString());
        }
    }

    /*
     * takes a card c and adds it to the players hand
     */
    void addCard(Card c){
        hand.add(c);
    }

    /* 
     * calculates the value of the players hand
     * it adds each card to int handVal according to the value of the rank 
     * NOTE: all face cards have value 10, so for all ranks that correspond to face cards, 
     * program just adds 10, instead of rank value
     * NOTE 2: acePresent - IF PLAYER HAS ACE, it allows the program to make sure that 
     * the player has the highest possible value without exceeding 21
     */
    int calcHand(){
        int handVal = 0;
        boolean acePresent = false;
        for (int i = 0; i < hand.size(); i++){
            if (hand.get(i).rank <= 10){
                handVal = hand.get(i).rank + handVal;
            } else { //see NOTE in above comment
                handVal = handVal + 10;
            }
            if (hand.get(i).rank == 1){
                acePresent = true;
            }
        }
        if ((handVal <= 11) && (acePresent == true)){ //see NOTE 2 in above comment
            handVal = 10 + handVal;
        }
        return handVal; //returns variable handVal to be printed/compared etc.
    }
}
