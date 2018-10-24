import java.awt.*;
import javax.swing.*;
/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-15 
 */
public class JapaneseFlag extends Canvas{
   public static void main(String[] args){
      JFrame frame = new JFrame("Window Title");
      Canvas canvas = new JapaneseFlag();
      canvas.setSize(800, 400);
      canvas.setBackground(Color.white);
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
   }
   public void paint(Graphics g){
      // Drawing codes
      g.setColor(Color.red);
      g.fillOval(250,50,300,300);
   }
}
