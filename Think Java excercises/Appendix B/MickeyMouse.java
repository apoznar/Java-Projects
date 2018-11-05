import java.awt.*;
import javax.swing.*;
/**
 * The MickeyMouse class implements an application that 
 * 
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-25
 */
public class MickeyMouse extends Canvas {
    /** 
     * This main method creates JFrame object and sets canvas size.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Title");
        Canvas canvas = new MickeyMouse();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /** 
     * Colors created shape.
     */
    public void paint(Graphics g) {
        Color ty = new Color(102,204,255);
        g.setColor(ty);
        Rectangle r = new Rectangle(152,304,96,96);
        mickey(g, r);
    }
    /** 
     * Getter of object sizes.
     */
    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }
    /** 
     * Finishes shape of the object.
     */
    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);
        int dx = bb.width / 2;
        int dy = bb.height / 2;
        boolean needsSubEar = dx >= 3; 
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        half.translate(-dx / 2, -dy / 2);
        boxOval(g, half);
        if (needsSubEar) {
            mickey(g,half);
        }
        half.translate(dx * 2, 0);
        boxOval(g, half);
        if (needsSubEar) {
            mickey(g,half);
        }
    }
}
