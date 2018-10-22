/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class ArePrimeFactors {
     /** 
 * This main method executes both methods.
 */
    public static void main(String[] args) {
    }
    
     /** 
 * This method checks if n is > 2, then chcecks if
* it is even.
 */
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        } 
        else if (n > 2){
            if (n % 2 == 0){
                return false;
            }
            for (int i = 3;i<=(int)Math.sqrt(n);i+=2){
                if (n % i !=0){
                    return false;
                }
            }
            
        }
        return true;
    }
     /** 
 * This method checks if elements in an array are..
 */
    public static boolean arePrimeFactors(int n, int[] arr){
        int result = 1;
        for (int element:arr){
            if (isPrime(element)){
                result *= element;
            } 
            else {
                return false;
            }
        }
        if (result == n){
            return true;
        } 
        else {
            return false;
        }
    }
}
