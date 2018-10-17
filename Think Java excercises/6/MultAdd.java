public class MultAdd {
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static void main(String[] args) {
        System.out.println(multAdd(1.0, 2.0, 0.0));
    }
     /** 
 * This method takes three arguments and makes
 * series of computations.
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
 * This method computes expotential value of variable x
 * and returns it.
 */
    public static double expSum(double x) {
        double expCompute = x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
        return expCompute;
    }
}
