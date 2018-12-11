/**
 * The IsAnagram class implements an application that 
 * takes two strings and checks if they are anagrams
 * of each other.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19 
 */
public class IsAnagram {
    /** 
     * This main method gives two strings and prints isAnagram
     * method with it.
     */
    public static void main(String args[]) {
        String str1 = "Adam";
        String str2 = "Mada";
        System.out.println(isAnagram(str1, str2));
    }
    /** 
     * Runs both strings from main through letterHist methods, checks if their
     * length and order of letters is the same and returns boolean value.
     */
    public static boolean isAnagram(String str1, String str2){
        int[] result1 = letterHist(str1);
        int[] result2 = letterHist(str2);
        if (result1[26] != 0 || result2[26] != 0) {
            return false; }
        for (int i = 0; i < 26; i++) {
            if (result1[i] != result2[i]) {
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
