/* test class for card
 * it works... yeet.
 */
class CardTestDrive {
    public static void main(String[] args){
        int testRank = Card.THREE;
        int testSuit = Card.DIAMONDS;
        Card card1 = new Card(testSuit, testRank);
        if ((card1.rank == testRank) && (card1.suit == testSuit)){
            System.out.println(card1.rankToString(testRank) + " of " + card1.suitToString(testSuit));
        } else {
            System.out.println("no");
        }
    }  
}