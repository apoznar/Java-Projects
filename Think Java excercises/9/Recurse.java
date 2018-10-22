/**
 * The Recurse class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-14
 */
public class Recurse {
     /** 
 * This main method 
 */
    public static void main(String args[]){
        System.out.println(isPalindrome("otto"));
    }
     /** 
 * This main method 
 */
    public static void printString(String str){
        if (length(str) != 0){
            System.out.println(first(str));
            printString(rest(str));
        }
    }
     /** 
 * This main method 
 */
    public static void printBackward(String str){
        if (length(str) != 0){
            printBackward(rest(str));
            System.out.println(first(str));
        }
    }
     /** 
 * This main method 
 */
    public static String reverseString(String str){
        if (length(str) != 0){
            return reverseString(rest(str)) + first(str);
        }
        return "";
    }
     /** 
 * This main method 
 */
    public static boolean isPalindrome(String str){
        int length = length(str);
        if (length == 1){
            return true;
        } 
        else if (length == 2){
            return first(str) == first(rest(str));
        } 
        else {
            return first(str) == first(reverseString(rest(str))) && isPalindrome(middle(str));
        }
    }
    
