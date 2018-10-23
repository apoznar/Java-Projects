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
public class RectPoint {
     /** 
 * This main method 
 */
    Rectangle box1 = new Rectangle(2,4,7,9);
    Point p1 = findCenter(box1);
    printPoint(p1);
    box1.grow(1, 1);
    Point p2 = findCenter(box1);
    printPoint(p2);
    
    /*
     p2.x += 1;
     printPoint(p1);
     printPoint(p2);
     */
     /** 
 * This main method 
 */
    public static void printPoint(Point p){
        System.out.println("("+p.x+", "+p.y+")");
    }
     /** 
 * This main method 
 */
    public static Point findCenter(Rectangle box){
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x,y);
    }
    
