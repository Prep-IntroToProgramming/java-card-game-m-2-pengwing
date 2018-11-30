import java.util.*;
public class Game {
    Player p1 = new Player();
    Player dealer = new Player();
    Deck deck1 = new Deck();
    public void main(String[] args){
        p1.chooseName();
        deck1.shuffle();
        for (int i = 0; i < 2; i++){
            Card c = deck1.draw();
            p1.addCard(c);
            Card x = deck1.draw();
            dealer.addCard(x);
        }
        System.out.println("The dealer's hand is:");
        dealer.showHand();
        System.out.println("Your hand is:");
        p1.showHand();
        if (p1.calcHand() == 21){
            System.out.println("you won!");
        }
        while (dealer.calcHand() < 17){
            Card c = deck1.draw();
            dealer.addCard(c);
        }
    }
}
