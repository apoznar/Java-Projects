/**
 * The AreFactors class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14 
 */

public class AreFactors {
     /** 
 * This main method executes areFactors method.
 */
    public static void main(String[] args) {
    }
     /** 
 * This method checks if an desired integer factor
 * is also in desired array and returns false if not
 * by using for loop.
 */
    
    public static boolean areFactors(int n, int[] factors){
        for (int factor:factors){
            if (n % factor != 0)
                return false;
        }
        return true;
    }
}
