import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 * The Moire class implements an application that 
 * creates moire pattern, an interference pattern
 * produced when an opaque ruled pattern with
 * transparent gaps is overlaid on another similar pattern.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-25 
 */
public class Moire extends Canvas {
    /** 
     * This main method creates JFrame object and sets canvas size and color.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /** 
     * Sets circular pattern in a center.
     */
    public void paint(Graphics g) {
        circularAtOrigin(g, 90, 3);
        circularAtCenter(g, 90, 3);
        radial(g, 0, 0.5);
    }
    /** 
     * Calculates tangens. 
     */
    public static double cot(double radian) {
        return 1 / Math.tan(radian);
    }
    /** 
     * Sets origin of patttern.
     */
    public void circularAtOrigin(Graphics g, int start, int interval) {
        int i = start;
        while (i < Math.min(getWidth(), getHeight())) {
            g.drawOval (0, 0, i, i);
            i += interval;
        }
    }
    /** 
     * Sets origin of pattern.
     */
    public void circularAtCenter(Graphics g, int start, int interval) {
        int i = start;
        while (i < Math.min(getWidth(), getHeight())) {
            int originX = (getWidth() - i) / 2;
            int originY = (getHeight() - i) / 2;
            g.drawOval (originX, originY, i, i);
            i += interval;
        }
    }
    /** 
     * Sets patterns to create moire effect.
     */
    public void radial(Graphics g, double startAngle, double interval) {
        double theta = startAngle;
        while (theta <= 180) { 
            if (theta > 45 && theta < 135) {
                int x1 = (int)((1 - cot(Math.toRadians(theta))) * getWidth() / 2);
                int y1 = getHeight();
                int x2 = (int)((1 + cot(Math.toRadians(theta))) * getWidth() / 2);
                int y2 = 0;
                g.drawLine(x1,y1,x2,y2);
            } 
            else {
                int x1 = 0;
                int y1 = (int)((1 + Math.tan(Math.toRadians(theta))) * getHeight() / 2);
                int x2 = getWidth();
                int y2 = (int)((1 - Math.tan(Math.toRadians(theta))) * getHeight() / 2);
                g.drawLine(x1,y1,x2,y2);
            } 
            theta += interval;
        }
    }
    
}
