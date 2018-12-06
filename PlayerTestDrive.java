/* a test class to make sure the player methods
 * EDIT: THEY WORK!!!
 * NOTE: ensures calcHand method treats the aces appropriately 
 * based on other cards in hand
 */
public class PlayerTestDrive {
    public static void main(String[] args){
        Player p = new Player();
        p.chooseName(); //yeet it works fambamjamalam
        p.addCard(new Card(3,1)); //creates an ACE OF HEARTS for player
        p.addCard(new Card(4,1)); //creates an ACE OF SPADES for player 
        p.addCard(new Card(3,13)); //creates a KING OF HEARTS for player
        p.showHand(); 
        System.out.println(p.calcHand()); // calcHand treats BOTH aces as 1; should be 12

        Player p1 = new Player();
        p1.addCard(new Card(3,10));
        p1.addCard(new Card(1,1));
        p1.showHand(); 
        System.out.println(p1.calcHand()); // calcHand treats ace as 1; should be 21
        
        Player p2 = new Player();
        p2.addCard(new Card(3,10));
        p2.addCard(new Card(1,1));
        p2.addCard(new Card(2,4));
        p2.showHand(); 
        System.out.println(p2.calcHand()); // calcHand treats ace as 1 to not exceed 21; should be 15
    }
}