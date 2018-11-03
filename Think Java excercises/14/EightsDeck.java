/**
 * The EightsDeck class implements an application that
 * construct a deck for Crazy Eights game.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-24 
 */
public class EightsDeck extends EightsCardCollection {
    /**
     * Invokes methods that construct deck of cards.
     */
    public EightsDeck(String label) {
        super(label);
        initialize();
    }
    /**
     * Constructs a standard deck of 52 cards.
     */
    private void initialize() {
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                append(new EightsCard(rank, suit));
            }
        }
    }
}
