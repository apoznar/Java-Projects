/**
 * The IsDivisible class implements an application that 
 * returns a boolean flag if conditions are met using if-else loop.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-16 
 */
public class IsDivisible {
    /** 
     * This main method prints isDivisible method using two set arguments.
     */
    public static void main(String[] args) {
        System.out.println(isDivisible(4, 2));
    }
    /** 
     * Takes two arguments from main method and checks if condition are met,
     * checking if modulus from division is present.
     */
    public static boolean isDivisible(int n, int m) {
        boolean divFlag;
        if (n % m == 0) {
            divFlag = true;
        } else {
            divFlag = false;
        }
        return divFlag;
    }
}
