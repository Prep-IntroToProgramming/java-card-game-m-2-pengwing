import java.util.*;
public class Game {
    Player p1 = new Player(); //creates a new player object called p1
    Player dealer = new Player(); //creates new player object called dealer
    Deck deck1 = new Deck(); //creates new deck from the deck constructor in the deck class
    Scanner input = new Scanner(System.in); //gets user input
    public void main(){
        p1.chooseName();// runs the choose name method, and allows player to input a name
        deck1.shuffle(); // shuffles the deck to start the game
        for (int i = 0; i < 2; i++){ //repeats twice, and gives the dealer and player cards
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
            /*
             * two while loops have to be combined in some way so if you
             * input an int and then a string, it doesn't
             * crash. right now, if you do that, it'll crash
             */
            while (!input.hasNextInt()){
                System.out.println("that's not an integer. try again");
                input.nextLine();
                //makes sure user CANNOT input anything other than an integer
            }
            int choice = input.nextInt();
            while ((choice != 1) && (choice !=2)){
                System.out.println("i said either 1 or 2 doofus");
                input.nextLine();
                choice = input.nextInt();
                //makes sure user CANNOT input anything other than 1 or 2
            }

            if (choice == 1){
                Card c = deck1.draw(); //taking  card from deck
                p1.addCard(c); //adding card to hand
                System.out.println("your new hand is:");
                p1.showHand();
                System.out.println("and it's value is: " + p1.calcHand()); 
                //tells user new hand and its value
                if (p1.calcHand() > 21) {
                    System.out.println("you lost hahahahahaha");
                    return; //if user exceeds 21, they lose automatically
                }
            } else if (choice == 2){
                System.out.println("cool. you held. awesomesauce");
                break; // breaks out of true loop
            } else {
                break; // breaks out of true loop
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
                return; //if dealer exceeds 21, player automatically wins
            } else {
                System.out.println(" ");
                System.out.println("The dealer's NEW hand is:");
                dealer.showHand();
                System.out.println("and its value is: " + dealer.calcHand());
                /* else, the program prints out the dealers new hand and its value
                 * instead of having the dealer automatically win if they get 21,
                 * it'll compare to the player's hand value in case they also got 21;
                 * in that case, we made it a tie
                 */
            }
        }

        int dealerVal = dealer.calcHand(); // assigns integer to final dealer and player calc hand values
        int p1Val = p1.calcHand();
        /* comparing dealer's hand to player's hand
         * if the dealer's hand is bigger, the player loses
         * if the dealer's hand is smaller, the player wins
         * if they're equal, then its a tie
         */ 
        if (dealerVal > p1Val){ 
            System.out.println("you lost");
        } else if (dealerVal < p1Val){
            System.out.println("you won!");
        } else {
            System.out.println("'tis tie");
        }
    }
}

