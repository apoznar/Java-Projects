/**
 * The MultAdd class implements an application that 
 * takes three arguments from main method and makes series
 * of computations using Math library.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-16 
 */
public class MultAdd {
    /** 
     * This main method invokes 'multAdd' method with
     * three double type arguments.
     */
    public static void main(String[] args) {
        System.out.println(multAdd(1.0, 2.0, 0.0));
    }
    /** 
     * takes three arguments from main method, makes
     * series of computations using 'Math' library, prints two of them,
     * invokes 'expSum' method and returns last computation result.
     */
    public static double multAdd(double a, double b, double c) {
        double multAddFlag = a * b + c;
        double firstCompute = (Math.sin(Math.PI/4.0)) 
            + (Math.cos(Math.PI/4.0))/2.0;
        double secondCompute = Math.log(10) + Math.log(20);
        System.out.println(firstCompute);
        System.out.println(secondCompute);
        expSum(2.0);
        return multAddFlag;
    }
    /** 
     * Computes expotential value of variable x and returns it.
     */
    public static double expSum(double x) {
        double expCompute = x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
        return expCompute;
    }
}
