public class OddSum {
    
    public static void main(String[] args) {
        System.out.println(oddSum(5));
    }
    
    public static int oddSum(int n) {
        if (n % 2 != 0 && n > 1) {
            return (n + oddSum(n - 2)); }
        else {
            return 1;
        }
        
    }
}

