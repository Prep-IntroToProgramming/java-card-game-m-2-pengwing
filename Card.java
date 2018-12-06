public class Card {
    //Here you need to declare the instance variables for the Card object
    /*
     * Declare instance variables
     */
    public final int suit;
    public final int rank;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    // Here you need to define the inds of suits. They are
    // DIAMONDS, CLUBS, HEARTS, SPADES (in order of value, starting at 1)
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Here you need to define the constructor. It takes an int for the 
    // starting rank and an int for the starting suit

    public Card(int startSuit, int startRank){
        if ((startSuit > 4) && (startSuit < 1)){
            throw new RuntimeException();
        } else {
            suit = startSuit;
        }
        if ((startRank > 13) && (startRank < 1)){
            throw new RuntimeException();
        } else {
            rank = startRank;
        }
    }
    // Here you need to declare the public getters for both rank and suit
    /*
     *
     * declaring the getters
     *
     */

    // Here is the if-then-else approach for returning the string
    // as a rank
    public static String rankToString(int rank) {
        if (rank == ACE) {
            return "Ace";
        } else if (rank == DEUCE) {
            return "Deuce";
        } else if (rank == THREE) {
            return "Three";
        } else if (rank == FOUR) {
            return "Four";
        } else if (rank == FIVE) {
            return "Five";
        } else if (rank == SIX) {
            return "Six";
        } else if (rank == SEVEN) {
            return "Seven";
        } else if (rank == EIGHT) {
            return "Eight";
        } else if (rank == NINE) {
            return "Nine";
        } else if (rank == TEN) {
            return "Ten";
        } else if (rank == JACK) {
            return "Jack";
        } else if (rank == QUEEN) {
            return "Queen";
        } else if (rank == KING) {
            return "King";
        } else {
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }

    // Here is the switch implementation of rankToString
    /*
    public static String rankToString(int rank) {
    switch (rank) {
    case ACE:
    return "Ace";
    case DEUCE:
    return "Deuce";
    case THREE:
    return "Three";
    case FOUR:
    return "Four";
    case FIVE:
    return "Five";
    case SIX:
    return "Six";
    case SEVEN:
    return "Seven";
    case EIGHT:
    return "Eight";
    case NINE:
    return "Nine";
    case TEN:
    return "Ten";
    case JACK:
    return "Jack";
    case QUEEN:
    return "Queen";
    case KING:
    return "King";
    default:
    //Handle an illegal argument.  There are generally two
    //ways to handle invalid arguments, throwing an exception
    //(see the section on Handling Exceptions) or return null
    return null;
    }    
    }
     */    

    // Here you need to declare a public class method called suitToString that takes an 
    // int (the suit) as input and uses if-else statements or a switch statement to 
    // return the String corresponding to a suit. Use rankToString as your template.
    public static String suitToString(int suit){
        switch (suit) {
            case DIAMONDS:
            return "Diamonds";
            case CLUBS:
            return "Clubs";
            case HEARTS:
            return "Hearts";
            case SPADES:
            return "Spades";
            default:
            return null;
        }
    }
    /*
     * overloaded method to be able to access the string version of a card, as
     * opposed to the number values of said card
     * DIFFERENCE FROM METHODS ABOVE: no parameter 
     * (allows user to use the methods with any specified card)
     */
    public String rankToString() {
        if (rank == ACE) {
            return "Ace";
        } else if (rank == DEUCE) {
            return "Deuce";
        } else if (rank == THREE) {
            return "Three";
        } else if (rank == FOUR) {
            return "Four";
        } else if (rank == FIVE) {
            return "Five";
        } else if (rank == SIX) {
            return "Six";
        } else if (rank == SEVEN) {
            return "Seven";
        } else if (rank == EIGHT) {
            return "Eight";
        } else if (rank == NINE) {
            return "Nine";
        } else if (rank == TEN) {
            return "Ten";
        } else if (rank == JACK) {
            return "Jack";
        } else if (rank == QUEEN) {
            return "Queen";
        } else if (rank == KING) {
            return "King";
        } else {
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }
      public String suitToString(){ 
        switch (suit) {
            case DIAMONDS:
            return "Diamonds";
            case CLUBS:
            return "Clubs";
            case HEARTS:
            return "Hearts";
            case SPADES:
            return "Spades";
            default:
            return null;
        }
    }
}
