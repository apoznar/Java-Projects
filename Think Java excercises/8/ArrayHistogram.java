/**
 * The AreFactors class implements an application that 
 * runs through an array of integers and
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18 
 */
public class ArrayHistogram {
    /** 
     * This main method executes areFactors method.
     */
    public static void main(String args[]) {
        System.out.println(areFactors());
    }
    /** 
     * This method checks if an desired integer factor
     * is also in desired array and returns false if not
     * by using for loop.
     */
   public static double[] powArray(double[] array, double power){
      double[] accumulator = new double[array.length];
      for (int i=0;i<array.length;i++){
         accumulator[i] = Math.pow(array[i],power);
      }
      return accumulator;
   }
       /** 
     * This method checks if an desired integer factor
     * is also in desired array and returns false if not
     * by using for loop.
     */
   public static int[] histogram(int[] array, int count){
      int[] counter = new int[count];
      for (int element:array){
         counter[element]++;
      }
      return counter;
   }