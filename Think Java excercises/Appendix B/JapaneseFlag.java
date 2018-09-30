import java.awt.*;
import javax.swing.*;

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