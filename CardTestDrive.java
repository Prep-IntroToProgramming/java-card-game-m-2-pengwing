/* test class for card
 * it works... yeet.
 */
class CardTestDrive {
    public static void main(String[] args){
        /* 
         * created two integers to make sure the card class will actually create a card
         */
        int testRank = Card.THREE;
        int testSuit = Card.DIAMONDS;
        Card card1 = new Card(testSuit, testRank);
        if ((card1.rank == testRank) && (card1.suit == testSuit)){
            System.out.println(card1.rankToString(testRank) + " of " + card1.suitToString(testSuit));
        } else {
            System.out.println("no");
        }
        
        //to test overloaded methods:
        /*
         * make a new card, use overloaded methods w/o parameters to print out rank and suit
         */
        int tRank = Card.KING;
        int tSuit = Card.SPADES;
        Card card2 = new Card(tSuit, tRank);
        System.out.println(card2.rankToString() + " of " + card2.suitToString());
        
    }  
}