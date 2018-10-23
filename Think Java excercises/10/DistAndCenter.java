import java.awt.Point;
import java.awt.Rectangle;
/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-15 
 */
public class DistAndCenter {
    /*
     Point blank = new Point(5,8);
     Rectangle rect = new Rectangle(0,2,4,4);
     Point center = findCenter(rect);
     double dist = distance(center, blank);
     System.out.println(dist);
     */
     /** 
 * This main method 
 */
    public static double distance(Point p1, Point p2){
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
     /** 
 * This main method 
 */
    public static Point findCenter(Rectangle box){
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
}
