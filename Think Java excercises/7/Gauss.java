/**
 * The Gauss class implements an application that 
 * takes two arguments and evaluates exp(-2x^2).
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-17 
 */
public class Gauss {
    /** 
     * This main method takes two arguments
     * and print gauss method output.
     */
    public static void main(String[] args) {
        System.out.println(gauss(1, 1));
    }
    /** 
     * Takes two arguments from main method and computes equation by using for loop.
     * ith element is (((-1)^i)*(x^2i))/i!, n is number of ith elements. 
     */
    public static double gauss(double x, int n) {
        double result = 1.0;
        int q = 1;
        double p = 1.0;
        int pre = 1;
        for (int i = 1; i < n; i++) {
            result += (pre*=-1)*(p*=x*x)/(q*=i);
        }
        return result;
    }
}
