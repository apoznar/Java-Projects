/**
 * A deck of playing cards.
 */
public class EightsDeck extends EightsCardCollection {

   public EightsDeck(String label) {
      super(label);
      initialize();
   }

   /**
    * Constructs a standard deck of 52 cards.
    */
   private void initialize(){
      for (int suit = 0; suit <= 3; suit++) {
         for (int rank = 1; rank <= 13; rank++) {
            append(new EightsCard(rank, suit));
         }
      }
   }

}