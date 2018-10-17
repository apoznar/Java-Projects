/**
 * The IsTriangle class implements an application that 
 * takes three arguments from main method
 * and prints variable with certain boolean value.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class IsTriangle {
     /** 
 * This main method takes three arguments and
 * prints isTriangle output.
 */
    public static void main(String[] args) {
        System.out.println(isTriangle(2, 2, 4));
    }
     /** 
 * This isTriangle method uses if-else loop
 * and changes boolean value of a variable if
 * certain conditions are met.
 */
    public static boolean isTriangle(int x, int y, int z) {
        boolean triangleFlag;
        if (x + y <= z || z + y <= x || x + z <= y) {
            triangleFlag = true;
        } else {
            triangleFlag = false;
        }
        return triangleFlag;
    }
}
