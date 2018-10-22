/**
 * The EncapArrays class implements an application that 
 * 
 * 
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14 
 */
public class EncapArrays {
     /** 
 * This main method 
 */
    public static void main(String[] args) {
    }
     /** 
 * This method 
 */
    public static double[] powArray(double[] array, double power){
        double[] accumulator = new double[array.length];
        for (int i=0;i<array.length;i++){
            accumulator[i] = Math.pow(array[i],power);
        }
        return accumulator;
    }
     /** 
 * This method 
 */
    public static int[] histogram(int[] array, int count){
        int[] counter = new int[count];
        for (int element:array){
            counter[element]++;
        }
        return counter;
    }
}
