/**
 * The Factorial class implements an application that 
 * takes one argument from main method and makes a factorial
 * using for loop.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-17
 */
public class Factorial {  
    /** 
     * This main method prints factorial method
     * using set argument.
     */
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    /** 
     * Takes argument from main method and makes a factorial using for loop.
     * 'Result' variable is multiplied by each 'i' from 1 to n and is returned.
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
