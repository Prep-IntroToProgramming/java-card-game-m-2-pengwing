/* a test class to make sure the player methods
 * EDIT: THEY WORK!!!
 */
public class PlayerTestDrive {
    public static void main(String[] args){
        Player p = new Player();
        p.chooseName(); //yeet it works fambamjamalam
        p.addCard(new Card(3,1)); //creates an ACE OF HEARTS for player
        p.addCard(new Card(4,1)); //creates an ACE OF SPADES for player 
        p.addCard(new Card(3,13)); //creates a KING OF HEARTS for player
        p.showHand(); 
        System.out.println(p.calcHand()); // should be 12

        Player p1 = new Player();
        p1.addCard(new Card(3,10));
        p1.addCard(new Card(1,1));
        p1.showHand(); 
        System.out.println(p1.calcHand()); // should be 21
        
        Player p2 = new Player();
    }
}