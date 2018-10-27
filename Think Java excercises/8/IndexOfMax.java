/**
 * The IndexOfMax class implements an application that
 * takes an array of integers and returns index of 
 * largest element by using enchanced for loop.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18 
 */
public class IndexOfMax {
    /** 
     * This main method executes indexOfMax method
     * with given parameters and gives indexes to array elements.
     */
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i = 0; i < 100; ++i) {
            array[i] = i;
        }
        indexOfMax(array);
    }
    /** 
     * Prints highest index in an array.
     */
    public static void indexOfMax(int[] array) {
        int index = 0;
        int i = 0;
        for (int number : array) {
            if (array[i] > array[index]) {
                index = i;
            }
            i++;
        }
        System.out.println(index);
    }
}
