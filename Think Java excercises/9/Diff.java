    /**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class Diff {
     /** 
 * This main method 
 */
    public static int diff(String str, char open, char close){
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c == open){
                count++;
            } 
            else if (c == close){
                count--;
            }
        }
        return count;
    }
     /** 
 * This main method 
 */
    public static int diffParenthesis(String str){
        return diff(str, '(',')');
    }
}
