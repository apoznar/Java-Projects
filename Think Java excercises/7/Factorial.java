/**
 * The Factorial class implements an application that 
 * takes one argument from main method and makes a factorial
 * using for loop.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13
 */
public class Factorial {  
     /** 
 * This main method prints factorial method
 * using set argument.
 */
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }
     /** 
 * This method takes argument from main method
 * and makes a factorial from it using for loop.
 */
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}

