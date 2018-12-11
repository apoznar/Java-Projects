/**
 * The IsDoubloon class implements an application that 
 * takes a string and checks if its all letters appear exactly twice.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19 
 */
public class IsDoubloon { 
    /** 
     * This main method gives a string and prints isDoubloon
     * method with it.
     */
    public static void main(String args[]) {
        String word = "Abba";
        System.out.println(isDoubloon(word));
    }
    /** 
     * First it checks if length of string is valid, then it returns true if
     * all letters appear exactly twice.
     */
    public static boolean isDoubloon(String str){
        if (str.length() == 0) {
            return false;
        }
        for (int count : letterHist(str)) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }
    /** 
     * Transforms string to array with uppercase letters and makes a histogram.
     */
    public static int[] letterHist(String str) {
        char[] characters = str.toUpperCase().toCharArray();
        int[] result = new int[27];
        for (char letter : characters) {
            if (letter >= 65 && letter <= 90) {
                result[letter - 65] += 1;
            } 
            else if (letter != 32) {
                result[27] += 1;
            }
        }
        return result;
    }
}
