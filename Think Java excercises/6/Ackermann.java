/**
 * The Ackermann class implements an application that 
 *  calculate the Ackermann function A(M, N)
 *  using a straightforward recursive program.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class Ackermann {
     /** 
 * This main method prints prints
 * 'ack' method with two arguments.
 */
    public static void main(String[] args) {
        System.out.println(ack(0, 2));
    }
     /** 
 * This method takes two integer arguments
 * and returns proper value through if-else loop
 * when conditions met.
 */
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m-1,1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1,ack(m, n - 1));                      
        } else {
            return 0;
        }
    }
}


