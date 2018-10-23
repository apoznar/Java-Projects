import java.math.BigInteger;
/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-15
 */
public class Big{
     /** 
 * This main method 
 */
    public static void main(String args[]){
        BigInteger integer = BigInteger.valueOf(2147483647);
        System.out.println(integer.add(BigInteger.ONE).pow(10));
        for (int i=0;i<30;i++){
            System.out.println(i+": "+factorial(i));
        }
    }
     /** 
 * This main method 
 */
    public static BigInteger factorial(int number){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = number;i>0;i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result; 
    }
}
