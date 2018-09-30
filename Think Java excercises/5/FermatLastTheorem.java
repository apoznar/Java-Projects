//this class checks Fermat's Law:
//there are no integers a,b,c when a^n + b^n = c^n, except when n >= 2
public class FermatLastTheorem {
    
    public static void main(String[] args) {
        checkFermat(1, 1, 1, 1);
    }
    
    public static void checkFermat(int a, int b, int c, int n) {
        if ((n > 2) && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
            System.out.println("Holy smokes! Fermat was wrong!"); }
        else {
            System.out.println("No, that doesn't work.");
        }
    }
}