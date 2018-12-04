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
        /* if either dealer or player gets 21 immediately, they win/lose 
         * accordingly
         */
        if (p1.calcHand() == 21){
            System.out.println("you won!");
            return; //return statement ends game
        }
        if (dealer.calcHand() == 21){
            System.out.println("you lose :(");
            return; //return statement ends game
        }
        System.out.println(" ");
        while (true){ //true is always true so it continues until it breaks
            System.out.println("to hit, press 1. to hold, press 2"); //prompts user to hit or hold
            while (!input.hasNextInt()){
                System.out.println("that's not an integer. try again");
                input.nextLine();
            }
            int choice = input.nextInt();
            while ((choice != 1) && (choice !=2)){
                System.out.println("i said either 1 or 2 doofus");
                input.nextLine();
                choice = input.nextInt();
            }

            if (choice == 1){
                Card c = deck1.draw(); //taking  card from deck
                p1.addCard(c); //adding card to hand
                System.out.println("your new hand is:");
                p1.showHand();
                System.out.println("your new hand value is: " + p1.calcHand());
                if (p1.calcHand() > 21) {
                    System.out.println("you lost hahahahahaha");
                    return;
                }
            } else if (choice == 2){
                System.out.println("cool. you held. awesomesauce");
                break;
            } else {
                break;
            }
        }
        
        while (dealer.calcHand() <= 16){
            Card c = deck1.draw();
            dealer.addCard(c);
            if (dealer.calcHand() > 21){
                System.out.println(" ");
                System.out.println("the dealers new hand is:");
                dealer.showHand();
                System.out.println("and its value is: " + dealer.calcHand());
                System.out.println("you won! congrats fam");
                return;
            } else if (dealer.calcHand() == 21){
                System.out.println(" ");
                System.out.println("the dealers new hand is:");
                dealer.showHand();
                System.out.println("and its value is: " + dealer.calcHand());
            } else {
                System.out.println(" ");
                System.out.println("The dealer's NEW hand is:");
                dealer.showHand();
                System.out.println("and its value is: " + dealer.calcHand());
            }
        }
        
        int dealerVal = dealer.calcHand();
        int p1Val = p1.calcHand();
        if (dealerVal > p1Val){
            System.out.println("you lost");
        } else if (dealerVal < p1Val){
            System.out.println("you won!");
        } else {
            System.out.println("'tis tie");
        }
    }
}


