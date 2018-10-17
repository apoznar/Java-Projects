/**
 * The IsDivisible class implements an application that 
 * returns a boolean flag if conditions are met
 * using if-else loop.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class IsDivisible {
     /** 
 * This main method prints isDivisible method
 * using set arguments.
 */
    public static void main(String[] args) {
        System.out.println(isDivisible(4, 2));
    }
     /** 
 * This isDivisible method takes two arguments from
 * main method and checks if condition are met.
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
