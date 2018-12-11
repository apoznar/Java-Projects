import java.util.Arrays;
/**
 * The Letterhist class implements an application that
 * takes a string as a parameter and returns a histogram
 * of the letters in the string.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19 
 */
public class LetterHist {
    /** 
     * This main method sets both strings and print output of canSpell method.
     */
    public static void main(String[] args) {
        String word = "arbuz";
        String libchar = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(canSpell(word, libchar));
    }
    /** 
     * Runs both strings through letterHist method and store results in arrays.
     * Then it checks if all characters in 'word' are present in 'libchar' and
     * returns true if so using for loop.
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
     * Takes both strings from main in canSpell method and transforms them
     * to upper case and to character arrays. It creates an int array long as
     * number of letters in english alphabet. Then, using for loop it iterates
     * through all letters in string, checks their ASCII code and add +1 to
     * result variable of each type of character every time it encounters 
     * a repetition. Finally it prints arrays by Array library.
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
        System.out.println(Arrays.toString(result));
        return result;
    }
}
