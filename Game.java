import java.util.*;
public class Game {
    Player p1 = new Player();
    Player dealer = new Player();
    Deck deck1 = new Deck();
    public void main(String[] args){
        p1.chooseName();
        deck1.shuffle();
        
    }
}