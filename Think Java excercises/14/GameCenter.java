import java.util.ArrayList;

public class GameCenter{
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