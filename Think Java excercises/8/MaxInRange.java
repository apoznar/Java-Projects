/**
 * The MaxInRange class implements an application that 
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14 
 */
public class MaxInRange {
     /** 
 * This main method 
 */
    public static void main(String[] args) {
    }
     /** 
 * This method 
 */
    public static int maxInRange(int[] integers, int lowIndex, int highIndex){
        if (lowIndex == highIndex){
            return integers[lowIndex];
        }
        int mid = (lowIndex + highIndex) / 2;
        return Math.max(maxInRange(integers,lowIndex,mid),maxInRange(integers,(mid + 1),highIndex));
    }
     /** 
 * This method 
 */
    public static int max(int[] integers){
        return maxInRange(integers, 0, integers.length - 1);
    }
}
