/**
 * The RecursiveProd class implements an application that 
 * returns appropriate output using given arguments
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-16 
 */
public class RecursiveProd {
    /** 
     * This main method gives two arguments and prints 'prod' method output.
     */
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }
    /** 
     * Takes arguments from main method, computes equation and returns value
     * by using shortened if-else loop.
     */
    public static int prod(int m, int n) {
        return ((m==n) ? (n) : (n*prod(m, n - 1)));
    }
}
