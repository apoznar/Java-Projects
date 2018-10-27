import java.util.Arrays;
/**
 * The AreFactors class implements an application that 
 * takes a double array and returns new one that contains
 * elements of a squared and also that takes int array of 0-99
 * and returns a histogram of 100 counters.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18 
 */
public class ArrayHistogram {
    /** 
     * This main method executes powArray and histogram 
     * methods with given parameters.
     */
    public static void main(String args[]) {
        double[] array = {10.0,20.0,30.0};
        powArray(array, 2);
        int [] array2 = new int[100];
        for (int i = 0; i < 100; ++i) {
            array2[i] = i;
        }
        histogram(array2, 100);
    }
    /** 
     * Takes a double type array from main and prints a new one that contains
     * elements squared by power parameter from main by using for loop.
     */
    public static void powArray(double[] array, int power) {
        double[] b = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            b[i] = Math.pow(array[i], power);
        }
        System.out.println(Arrays.toString(b));
    }
    /** 
     * Takes int array of 0-99 from main and returns a histogram of 100 counters.
     */
    public static void histogram(int[] array2, int count) {
        int[] counts = new int[count];
        for (int element : array2) {
            counts[element]++;
        }
        System.out.println(Arrays.toString(counts));
    }
}
