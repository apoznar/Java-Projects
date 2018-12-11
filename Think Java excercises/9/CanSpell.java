/**
 * The CanSpell class implements an application that 
 * takes two strings and checks whether the set of tiles
 * can spell the word.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19 
 */
public class CanSpell {
    /** 
     * This main method gives two strings and prints isAnagram
     * method with it.
     */
    public static void main(String args[]) {
        String word = "jib";
        String libchar = "quijibo";
        System.out.println(canSpell(word, libchar));
    }
    /** 
     * Runs both strings from main through letterHist method and checks
     * if it is possible to form 'word' String from letters in 'libchar' String.
     */
    public static boolean canSpell(String word, String libchar) {
        int[] wordRequirement = letterHist(word);
        int[] libCapacity = letterHist(libchar);
        for (int i = 0; i < 26; i++) {
            if (wordRequirement[i] > libCapacity[i]) {
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
