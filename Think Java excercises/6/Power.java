/**
 * The Power class implements an application that 
 * displays powered value using multiple if-else loops.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class Power {
     /** 
 * This main method gives two arguments to power method
 * and prints the output.
 */
    public static void main(String[] args) {
        System.out.println(power(0, 2));
    }
     /** 
 * This main method takes two arguments and using
 * multiple if-else loops returns different outputs.
 */
    public static double power(double x, int n){
        if (x == 0){
            if (n == 0){
                return 233.3;
            } 
            else {
                return 0;
            }
        }
        else {
            if (n == 1){
                return x;
            } 
            else if (n == 2){
                return x*x;
            } 
            else {
                if (n % 2 == 0){
                    return power(power(x,n/2),2);
                } 
                else {
                    return x*power(x,n-1);
                }
            }
        }
    }
}

