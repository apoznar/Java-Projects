/**
 * The AreFactors class implements an application that 
 * takes an integer n and an array of integers, an that 
 * returns true if the numbers in the array are all factors of n.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18 
 */
public class AreFactors {
    /** 
     * This main method executes areFactors method.
     */
    public static void main(String args[]) {
        int[] a = {1, 8};
        System.out.println(areFactors(8, a));
    }
    /** 
     * This method checks if an desired integer factor
     * is also in desired array and returns false if not
     * by using for loop.
     */
    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0)
                return false;
        }
        return true;
    }
}
