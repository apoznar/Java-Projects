/** 
 * This class invokes parameters from other method than main 
 **/
public class Zool {

    public static void zool(int x, String y, String z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        int x = 11;
        String y = "Cat";
        String z = "Jaworowa";
        zool(x, y, z);
    }

}
