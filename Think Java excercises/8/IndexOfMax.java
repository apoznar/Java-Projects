/**
 * The IndexOfMax class implements an application that 
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14 
 */
public class IndexOfMax {
     /** 
 * This main method
 */
    public static void main(String[] args) {
    }
     /** 
 * This method
 */
    public static int indexOfMax(int[] numbers){
        int index = 0;
        for (int i=1;i<numbers.length;i++){
            if (numbers[i] > numbers[index]){
                index = i;
            }
        }
        return index;
    }
     /** 
 * This method
 */
    public static int indexOfMaxWrittenInEnhancedForLoop(int[] numbers){
        int index = 0;
        int i = 0;
        for (int number : numbers){
            if (numbers[i] > numbers[index]){
                index = i;
            }
            i++;
        }
        return index;
    }
    
}
