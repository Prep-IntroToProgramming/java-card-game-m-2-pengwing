/* a test class to make sure the player methods
 * EDIT: THEY WORK!!!
 */
public class PlayerTestDrive {
    public static void main(String[] args){
        Player p = new Player();
        p.chooseName(); //yeet it works fambamjamalam
        p.addCard(new Card(3,1));
        p.addCard(new Card(4,1));
        p.addCard(new Card(3,13));
        p.showHand();
        System.out.println(p.calcHand());
    }
}