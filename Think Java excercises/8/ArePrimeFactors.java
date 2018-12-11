/**
 * The ArePrimeFactors class implements an application that 
 * takes an integer n, an array of integers and returns
 * true if numbers in array are all prime and their product is n.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18
 */
public class ArePrimeFactors {
    /** 
     * This main method executes arePrimeFactors method with given arguments.
     */
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 7};
        System.out.println(arePrimeFactors(n, arr));
    }
    /** 
     * Checks if elements in an array are prime and their product is n.
     */
    public static boolean arePrimeFactors(int n, int[] arr) {
        int result = 1;
        for (int element : arr) {
            if (isPrime(element)) {
                result *= element;
            } 
            else {
                return false;
            }
        }
        if (result == n) {
            return true;
        } 
        else {
            return false;
        }
    }
    /** 
     * Checks if n is > 2, then checks if it is odd.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } 
        else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
                if (n % i != 0) {
                    return false;
                }
            }  
        }
        return true;
    }
}
