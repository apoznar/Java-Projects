/**
 * The RecursiveProd class implements an application that 
 * returns appropriate output using given arguments
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class RecursiveProd {
     /** 
 * This main method gives two arguments and prints
 * appropriate output.
 */
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }
     /** 
 * This method takes arguments from main method,
 * computes equation and returns value.
 */
    public static int prod(int m, int n) {
        return ((m==n)?(n):(n*prod(m, n - 1)));
    }
}




