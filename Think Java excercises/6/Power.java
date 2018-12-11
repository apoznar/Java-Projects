/**
 * The Power class implements an application that 
 * displays powered value using multiple if-else loops.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-16
 */
public class Power {
    /** 
     * This main method gives two arguments and prints 'power' method.
     */
    public static void main(String[] args) {
        System.out.println(power(0.0, 2));
    }
    /** 
     * Takes two arguments from main method and using
     * multiple nested if-else loops returns different outputs.
     */
    public static double power(double x, int n) {
        if (x == 0){
            if (n == 0) {
                return 233.3;
            } 
            else {
                return 0;
            }
        }
        else {
            if (n == 1) {
                return x;
            } 
            else if (n == 2) {
                return x*x;
            } 
            else {
                if (n % 2 == 0) {
                    return power(power(x, n/2), 2);
                } 
                else {
                    return x*power(x, n-1);
                }
            }
        }
    }
}
