/** 
 * The FermatLastTheorem class implements an application that
 * takes four arguments and checks Fermat's Law - 
 * there are no integers a,b,c when a^n + b^n = c^n, except when n >= 2.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-15
 */
public class FermatLastTheorem {
    /** 
     * This main method invokes 'checkFermat' method with four arguments.
     */
    public static void main(String[] args) {
        checkFermat(1, 1, 1, 1);
    }
    /** 
     * do if-else loop checking if set arguments from main method
     * can prove right or wrong Fermat's Law and prints appropriate message.
     */
    public static void checkFermat(int a, int b, int c, int n) {
        if ((n > 2) && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
            System.out.println("Holy smokes! Fermat was wrong!"); }
        else {
            System.out.println("No, that doesn't work.");
        }
    }
}
