/**
 * The EightsCard class implements an application that 
 * returns score of cards in a game of Crazy Eights.
 * 
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-24
 */
public class EightsCard extends Card {
    /** 
     * Invokes super method with given parameters.
     */
    public EightsCard(int rank, int suit) {
        super(rank, suit);
    }
    /**
     * Returns `true` if matches `that` with rule of crazy eights
     * Otherwise `false`.
     */
    public boolean matches(EightsCard that) {
        if (getSuit() == that.getSuit()) {
            return true;
        }
        if (getRank() == that.getRank()) {
            return true;
        }
        if (getRank() == 8) {
            return true;
        }
        return false;
    }
    /**
     * Returns the score of the card.
     */
    public int score() {
        int rank = getRank();
        if (rank == 8) {
            return -20;
        } 
        else if (rank > 10) {
            return -10;
        } 
        else {
            return -rank;
        }
    }
}
