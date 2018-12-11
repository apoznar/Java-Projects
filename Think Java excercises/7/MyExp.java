/**
 * The MyExp class implements an application that 
 * takes two parameters  and estimates e^x by different methods
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-17
 */
public class MyExp {
    /** 
     * This main method iterates 'check' method with values 0.1, 1.0, 10.0 and 100.0.
     * Also it iterates with values -0.1, -1.0, -10.0 and -100.0. It also prints
     * 'myexp' method with two given arguments.
     */
    public static void main(String[] args) {
        for (double i = 0.1; i <= 100; i *= 10) {
            check(i);
        }
        for (double i = -0.1; i <= -100; i *= -10) {
            check(i);
        }
        System.out.println(myexp(2.0, 3));
    }
    /** 
     * Estimates e^x by adding n terms in the series.
     */
    public static double myexp(double x, int n) {
        double result = 1;
        double p = 1;
        double q = 1;
        for (int i = 1; i < n; i++) {
            result += (p *= x)/(q *= i);
        } 
        return result;
    }
    /** 
     * Takes a parameter x and displays x, myexp(x) and Math.exp(x).
     */
    public static void check(double x) {
        int i = 1;
        double interval = 0;
        do {
            i++;
            interval = Math.abs(myexp(x, i) - Math.exp(x));
            System.out.println(i + "\t" + interval);
        }
        while (interval > 0.0000001);
        System.out.println(x + "\t" + myexp(x, i) + "\t" + Math.exp(x));
    }
}

//later - check output once again
