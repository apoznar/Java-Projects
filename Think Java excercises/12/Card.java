/**
 * The Card class implements an application that 
 * creates a deck of cards with proper ranks and suits,
 * and provides mechanism to compare them.
 * 
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-22 
 */
public class Card {
    /** 
     * This main method invokes makeDeck method.
     */
    public static void main(String args[]) {
        makeDeck();
    }
    /** 
     * Creates a Card object 'cards', an array with 52 cards with 13 cards 
     * ranked 1-13 in each of four suits.
     */
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1;rank <= 13; rank++) {
                cards[suit * 3 + rank] = new Card(rank, suit);
            }
        }
        return cards;
    }
    /** 
     * Compares suits and ranks of cards and returns proper value. Also,
     * aces here are ranked higher than kings.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            if (this.rank == 1) {
                return 1;
            } 
            else {
                return -1;
            }
        }
        if (this.rank > that.rank) {
            if (that.rank == 1) {
                return -1;
            } 
            else {
                return 1;
            }
        }
        return 0;
    }
    /** 
     * Creates a new array that work as a histogram for cards.
     */
    public static int[] suitHist(Card[] cards) {
        int[] result = new int[4];
        for (Card card : cards) {
            result[card.getSuit()] += 1;
        }
        return result;
    }
    /** 
     * Checks if cards were generated correctly and returns true
     * if hand contains a flush (>= 5 cards in a hand).
     */
    public static boolean hasFlush(Card[] cards) {
        for (int count : suitHist(cards)) {
            if (count >= 5) {
                return true;
            }
        }
        return false;
    }
    /** 
     * Declaring variables and and constants with ranks and suits names.
     */
    private final int rank;
    private final int suit;
    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"
    };
    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"
    };
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    /** 
     * Makes a string with names of rank and suit.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
    /** 
     * Compares ranks and suits.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }
    /** 
     * Getter of rank variable.
     */
    public int getRank() {
        return this.rank;
    }
    /** 
     * Getter of suit variable.
     */
    public int getSuit() {
        return this.suit;
    }
    /** 
     * Searches unsorted cards and compares them.
     */
    public static int searchUnsorted(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i; 
            }
        }
        return -1;
    }
    /** 
     * Searches sorted cards and compares them.
     */
    public static int searchSorted(Card[] cards, Card target, int low, int high) {
        if (high < low) { 
            return -1; }
        int mid = (low + high) / 2;
        int comp = cards[mid].compareTo(target);
        if (comp == 0) {
            return mid;
        } 
        else if (comp < 0) {
            return searchSorted(cards, target, mid + 1, high);
        } 
        else {
            return searchSorted(cards, target, low, mid - 1);
        }
    }
}
