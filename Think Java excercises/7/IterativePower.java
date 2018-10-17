/**
 * The IterativePower class implements an application that 
 * takes two arguments from main method and makes an iterative power
 * using for loop.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class IterativePower {
     /** 
 * This main method gives two arguments
 * and prints output of a power method.
 */
    public static void main(String[] args) {
        System.out.println(power(0.0, 2));
    }
     /** 
 * This method takes two arguments from main method
 * and modifies result variable using for loop. 
 */
    public static double power(double x, int n){
        double result = 1.0;
        for (int i = 0; i < n; i++){
            result *= x;
        }
        return result;
    }
}


     
