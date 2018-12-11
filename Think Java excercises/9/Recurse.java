/**
 * The Recurse class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-19
 */
public class Recurse {
    /** 
     * This main method sets word String and invokes four methods with it
     * as an parameter.
     */
    public static void main(String args[]) {
        String word = "ada";
        printString(word);
        printBackward(word);
        System.out.println(reverseString(word));
        System.out.println(isPalindrome(word));
    }
    
    /** 
     * Takes str string as a parameter and displays letters of the string,
     * one on each line.
     */
    public static void printString(String str) {
        if (length(str) != 0) {
            System.out.println(first(str));
            printString(rest(str));
        }
    }
    /** 
     * Takes str string as a parameter and displays letters of the string,
     * one on each line, but backwards.
     */
    public static void printBackward(String str) {
        if (length(str) != 0) {
            printBackward(rest(str));
            System.out.println(first(str));
        }
    }
    /** 
     * Takes str string as a parameter and returns a new string as a return value.
     */
    public static String reverseString(String str) {
        if (length(str) != 0) {
            return reverseString(rest(str)) + first(str);
        }
        return "";
    }
    /** 
     * Takes str string and checks if it is an palindrome, then returns true.
     */
    public static boolean isPalindrome(String str) {
        int length = length(str);
        if (length == 1) {
            return true;
        } 
        else if (length == 2) {
            return first(str) == first(rest(str));
        } 
        else {
            return first(str) == first(reverseString(rest(str)))
                && isPalindrome(middle(str));
        }
    }
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    } 
    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }  
    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }
}
