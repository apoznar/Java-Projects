/** 
 * The Zool class implements an application that
 * prints variables by using other method than main.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-14 
 */
public class Zool {
    /** 
     * This main method contains three variables
     * and invokes other method with them.
     */
    public static void main(String[] args) {
        int x = 11;
        String y = "Cat";
        String z = "Jaworowa";
        zool(x, y, z);
    }
    /** 
     * This method takes three variables from main method
     * and prints them in separate lines.
     */
    public static void zool(int x, String y, String z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
