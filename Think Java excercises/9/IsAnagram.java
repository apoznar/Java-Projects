/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class IsAnagram {
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
    public static boolean isAnagram(String str1, String str2){
        int[] result1 = letterHist(str1);
        int[] result2 = letterHist(str2);
        if (result1[26] != 0 || result2[26] != 0) {
            return false;}
        for (int i=0;i<26;i++){
            if (result1[i] != result2[i]){
                return false;
            }
        }
        return true;
    }
}
