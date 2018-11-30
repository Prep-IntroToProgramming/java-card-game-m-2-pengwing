import java.util.*;
public class Game {
    Player p1 = new Player();
    Player dealer = new Player();
    Deck deck1 = new Deck();
    public void main(){
        p1.chooseName();
        deck1.shuffle();
        for (int i = 0; i < 2; i++){
            Card c = deck1.draw();
            p1.addCard(c); //adds two cards to player's hand
            Card x = deck1.draw();
            dealer.addCard(x); // adds two cards to dealer's hand
        }
        System.out.println("Your hand is:");
        p1.showHand(); //runs show hand method for player's hand
        System.out.println(" ");
        System.out.println("The dealer's hand is:");
        dealer.showHand(); //runs show hand method for dealer's hand
        if (p1.calcHand() == 21){
            System.out.println("you won!");
        }
        while (dealer.calcHand() < 17){
            Card c = deck1.draw();
            dealer.addCard(c);
            if (dealer.calcHand() > 21){
                dealer.showHand();
                System.out.println("You win by default.. you're not special");
            } else if (dealer.calcHand() == 21){
                dealer.showHand();
                System.out.println("you lose, SUCKER");
            } else {
                System.out.println("The dealer's new hand is:");
                dealer.showHand();
            }
        }
    }
