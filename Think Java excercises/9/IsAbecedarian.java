/**
 * The IsAbecedarian class implements an application that 
 * checks if letters in given string are aligned in alphabetical
 * order and returns proper boolean value.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19
 */
public class IsAbecedarian {
    /** 
     * This main method gives a string and prints isAbecedarian
     * method with it.
     */
    public static void main(String args[]) {
        String word = "abdest";
        System.out.println(isAbecedarian(word));
    }
    /** 
     * Converts given word to upper case, converts each character
     * to ASCII and compares each pair of characters in word. If
     * one after has lower value it returns false.
     */
    public static boolean isAbecedarian(String str) {
        String converted = str.toUpperCase();
        for (int i = 0 ; i < converted.length() - 1; i++) {
            char c = converted.charAt(i);
            if (c >= 65 && c <= 90) {
                if (c > converted.charAt(i+1)) {
                    return false;
                } 
            } 
            else {
                return false;
            }
        }
        return true;
    }
}
