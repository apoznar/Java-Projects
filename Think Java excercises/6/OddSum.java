/**
 * The OddSum class implements an application that 
 * takes one argument from main method and returns
 * appropriate sum using if-else loop.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class OddSum {
     /** 
 * This main method prints oddSum method
 * with set argument.
 */
    public static void main(String[] args) {
        System.out.println(oddSum(5));
    }
     /** 
 * This method takes argument from main method
 * and returns appropriate value using if-else loop.
 */
    public static int oddSum(int n) {
        if (n % 2 != 0 && n > 1) {
            return (n + oddSum(n - 2)); }
        else {
            return 1;
        }
        
    }
}

