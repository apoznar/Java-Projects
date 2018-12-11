import java.util.ArrayList;
/**
 * The GameCenter class implements an application that 
 * starts the game of Crazy Eights.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-24
 */
public class GameCenter {
    /** 
     * This main method adds players to the game and starts it.
     */
    public static void main(String args[]) {
        Eights.debug = true;
        int count = 20;
        ArrayList<EightsPlayer> players = new ArrayList<EightsPlayer>();
        players.add(new EightsPlayer("Random"));
        players.add(new EightsGenius("Genius"));
        players.add(new EightsPlayer("Random"));
        players.add(new EightsPlayer("Random"));
        Eights.test(players, count);
    }
}
