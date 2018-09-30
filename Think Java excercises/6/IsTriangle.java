public class IsTriangle {
    
    public static void main(String[] args) {
        System.out.println(isTriangle(2, 2, 4));
    }
    
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