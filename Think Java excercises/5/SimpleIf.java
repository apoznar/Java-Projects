/** 
 * The Simple class implements an application that
 * checks if number in variable x is positive digit number.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-15
 */
public class SimpleIf {
    /** 
     * This main method sets variable x and checks if it is
     * a positive single digit number.
     */
    public static void main(String[] args) {
        int x = 5;
        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        }
    }
}
