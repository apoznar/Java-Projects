public class RecursiveProd {
    
    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }
    
    public static int prod(int m, int n) {
        return ((m==n)?(n):(n*prod(m, n - 1)));
    }
}




