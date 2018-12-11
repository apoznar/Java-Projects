import java.awt.*;
import javax.swing.*;
/**
 * The JapaneseFlag class implements an application that 
 * creates a canvas that recreates japanese national flag.
 * 
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-25
 */
public class JapaneseFlag extends Canvas {
    /** 
     * This main method creates a new JFrame object,
     * sets size of canvas and its white color.
     */
    public static void main(String[] args){
        JFrame frame = new JFrame("Window Title");
        Canvas canvas = new JapaneseFlag();
        canvas.setSize(800, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /** 
     * Creates a red circle on canvas.
     */
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(250,50,300,300);
    }
}
