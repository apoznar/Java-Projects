/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class CanSpell {
     /** 
 * This main method 
 */
    public static int[] letterHist(String str){
        char[] characters = str.toUpperCase().toCharArray();
        int[] result = new int[27];
        for (char letter:characters){
            if (letter >= 65 && letter <= 90){
                result[letter-65]+=1;
            } 
            else if (letter != 32){
                result[27]+=1;
            }
        }
        return result;
    }
     /** 
 * This main method 
 */
    public static boolean canSpell(String word, String libchar){
        int[] wordRequirment = letterHist(word);
        int[] libCapacity = letterHist(libchar);
        for (int i=0;i<26;i++){
            if (wordRequirment[i] > libCapacity[i]){
                return false;
            }
        }
        return true;
    }
}
