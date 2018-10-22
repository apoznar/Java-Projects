/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14 
 */
public class IsAbecedarian {
     /** 
 * This main method 
 */
    public static boolean isAbecedarian(String str){
        String converted = str.toUpperCase();
        for (int i = 0;i<converted.length() - 1;i++){
            char c = converted.charAt(i);
            if (c >= 65 && c <= 90){
                if (c > converted.charAt(i+1)){
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
