import java.math.BigInteger;
/**
 * The Big class implements an application that 
 * transforms integer to BigInteger values and
 * powers scope of integers by 10 and makes factorials.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-20
 */
public class Big {
    /** 
     * This main method sets a BigInteger value to variable and
     * prints it powered by set value. Then it iterates through
     * numbers 1 to 30 and prints them and their value obtained
     * through factorial method.
     */
    public static void main(String args[]) {
        BigInteger integer = BigInteger.valueOf(2147483647);
        System.out.println(integer.add(BigInteger.ONE).pow(10));
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + ": " + factorial(i));
        }
    }
    /** 
     * Uses BigInteger library to transform value of result variable (1),
     * then it multiplies it by BigInteger values from main by using
     * for loop.
     */
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = number; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result; 
    }
}
