public class PlayerTestDrive {
    public static void main(String[] args){
        Player p = new Player();
        p.chooseName(); //yeet it works fambamjamalam
        p.addCard(new Card(3,9));
        p.showHand();
        System.out.println(p.calcHand());
    }
}