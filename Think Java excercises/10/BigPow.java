/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class BigPow{
     /** 
 * This main method 
 */
    public static BigInteger pow(int x, int n) {
        if (n == 0) 
            return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n/2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } 
        else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        } 
    }
}
