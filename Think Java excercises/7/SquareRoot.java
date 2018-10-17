/**
 * The SquareRoot class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class SquareRoot {
     /** 
 * This main method invokes squareRoot method 
 * with given parameter.
 */
    public static void main(String[] args) {
        squareRoot(2);
    }
     /** 
 * This method takes an argument from main method
 * and makes series of computations that are simply
 * square root and returns value.
 */
    public static double squareRoot(double a){
        double oldValue = a/2;
        double newValue = a/2;
        double interval = 0;
        do {
            oldValue = newValue;
            newValue = (oldValue + a/oldValue)/2;
            interval = Math.abs(newValue - oldValue);
            System.out.println(interval);
        } while(interval > 0.001);
        return newValue;
    }
}
