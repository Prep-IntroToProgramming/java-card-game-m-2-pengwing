import java.util.*;
public class Game {
    Player p1 = new Player();
    Player dealer = new Player();
    Deck deck1 = new Deck();
    Scanner input = new Scanner(System.in);
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
        System.out.println("your hand value is: " + p1.calcHand());
        System.out.println(" ");
        System.out.println("The dealer's hand is:");
        dealer.showHand(); //runs show hand method for dealer's hand
        System.out.println("the dealer's hand value is: " + dealer.calcHand());
        if (p1.calcHand() == 21){
            System.out.println("you won!");
            return;
        }
        if (dealer.calcHand() == 21){
            System.out.println("you lose :(");
            return;
        }
        System.out.println(" ");
        while (true){
            System.out.println("to hit, press 1. to hold, press 2");
            while (!input.hasNextInt()){
                System.out.println("ok... not an integer... try again");
                input.nextLine();
            }
            int choice = input.nextInt();
            if (choice == 1){
                Card c = deck1.draw();
                p1.addCard(c);
                System.out.println("your new hand is:");
                p1.showHand();
                System.out.println("your new hand value is: " + p1.calcHand());
            } else if (choice == 2){
                
            } else {
                while ((choice != 1) && (choice !=2)){
                    System.out.println("i said either 1 or 2 doofus");
                    input.nextLine();
                }
            }
        }
        while (dealer.calcHand() <= 16){
            Card c = deck1.draw();
            dealer.addCard(c);
            if (dealer.calcHand() > 21){
                System.out.println(" ");
                dealer.showHand();
                System.out.println("You win by default.. you're not special");
            } else if (dealer.calcHand() == 21){
                dealer.showHand();
                System.out.println("you lose, SUCKER");
            } else {
                System.out.println(" ");
                System.out.println("The dealer's NEW hand is:");
                dealer.showHand();
            }
        }
    }
}

