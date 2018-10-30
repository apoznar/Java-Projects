/**
 * The MaxInRange class implements an application that
 * takes an array of integers, two indexes, then finds
 * the maximum value in the array, but between indexes,
 * including both.
 * 
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-18
 */
public class MaxInRange {
    /** 
     * This main method invokes maxInRange method with given parameters.
     * Array is set, as well as minimum and maximum indexes.
     */
    public static void main(String[] args) {
        int[] integers = {0, 1, 2, 3, 4, 5};
        int lowIndex = 0;
        int highIndex = integers.length - 1;    
        System.out.println(maxInRange(integers, lowIndex, highIndex));
    }
    /** 
     * It first compare min and max parameters and returns min index if they are
     * equal. Then it calculates median, higest value up to median, higest value 
     * over median and print highest of them.
     */
    public static int maxInRange(int[] integers, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return integers[lowIndex];
        }
        int mid = (lowIndex + highIndex) / 2;
        return Math.max(maxInRange(integers, lowIndex, mid),
                        maxInRange(integers, (mid + 1), highIndex));
    }
}
