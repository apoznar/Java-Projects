/**
 * The OddSum class implements an application that 
 * takes one argument from main method and returns
 * appropriate sum using if-else loop.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-16 
 */
public class OddSum {
    /** 
     * This main method prints oddSum method with set argument.
     */
    public static void main(String[] args) {
        System.out.println(oddSum(5));
    }
    /** 
     * Takes argument from main method 
     * and returns appropriate value using if-else loop.
     */
    public static int oddSum(int n) {
        if (n % 2 != 0 && n > 1) {
            return (n + oddSum(n - 2)); 
        }
        else {
            return 1;
        }
    }
}
