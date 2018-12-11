/**
 * The SquareRoot class implements an application that 
 * makes a square root of a number without using Math library
 * and by using do-while loop.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-17 
 */
public class SquareRoot {
    /** 
     * This main method invokes squareRoot method with given parameter.
     */
    public static void main(String[] args) {
        squareRoot(2);
    }
    /** 
     * Takes an argument from main method and makes series of computations
     * by using do-while loop. It computes 'oldValue' variable, then 'newValue'
     * variable and 'interval' variable as a substraction of these two and prints 
     * it in loop. In next loop 'oldValue' is updated by latest 'newValue; variable 
     * and loop goes on until interval value is over 0.001, then it returns 
     * 'newValue' as a result.
     */
    public static double squareRoot(double a) {
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
