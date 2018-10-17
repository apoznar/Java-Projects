/**
 * The Gauss class implements an application that 
 * takes two arguments and computes Gauss equation.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class Gauss {
     /** 
 * This main method takes two arguments
 * and print gauss method output.
 */
    public static void main(String[] args) {
        System.out.println(gauss(1,1));
    }
     /** 
 * This method takes two arguments from main method
 * and coputes Gauss equation using for loop.
 */
    public static double gauss(double x, int n){
        double result = 1;
        int q = 1;
        double p = 1;
        int pre = 1;
        for (int i=1;i<n;i++){
            result += (pre*=-1)*(p*=x*x)/(q*=i);
        }
        return result;
    }
}
