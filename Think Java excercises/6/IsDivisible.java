public class IsDivisible {
    
    public static void main(String[] args) {
        System.out.println(isDivisible(4, 2));
    }
    
    public static boolean isDivisible(int n, int m) {
        boolean divFlag;
        if (n % m == 0) {
            divFlag = true;
        } else {
            divFlag = false;
        }
        return divFlag;
    }
}