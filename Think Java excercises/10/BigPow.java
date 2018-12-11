import java.math.BigInteger;
/**
 * The Big class implements an application that 
 * raises large integers to a power.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-20 
 */
public class BigPow {
    /** 
     * This main method invokes pow method with given parameters.
     */
    public static void main(String args[]) {
        System.out.println(pow(2, 5));
    }
    /** 
     * Returns a powered value, transformed to a BigInteger type. 
     */
    public static BigInteger pow(int x, int n) {
        if (n == 0) 
            return BigInteger.valueOf(1);
        // Find x to the n/2 recursively.
        BigInteger t = pow(x, n/2);
        // If n is even, the result is t squared.
        // If n is odd, the result is t squared times x.
        if (n % 2 == 0) {
            return t.multiply(t);
        } 
        else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        } 
    }
}
