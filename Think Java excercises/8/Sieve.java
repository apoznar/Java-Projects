/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class Sieve {
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static void main(String[] args) {
    }
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static boolean[] sieve(int n){
        boolean[] result = new boolean[n];
        for (int i=2;i<n;i++)
            result[i] = true;
        for (int number=2;number<=(int)Math.sqrt(n);number++){
            if (result[number] == true){
                for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
                    result[indexInSeries] = false;
                }
            }
        }
        return result;
    }
}
