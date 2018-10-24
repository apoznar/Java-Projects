import java.util.ArrayList;
/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-15 
 */
public class GameCenter{
    /** 
 * This main method 
 */
   public static void main(String args[]){
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
