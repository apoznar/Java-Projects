public class Power {
    
    public static void main(String[] args) {
        System.out.println(power(0, 2));
    }
    
    public static double power(double x, int n){
        if (x == 0){
            if (n == 0){
                return 233.3;
            } 
            else {
                return 0;
            }
        }
        else {
            if (n == 1){
                return x;
            } 
            else if (n == 2){
                return x*x;
            } 
            else {
                if (n % 2 == 0){
                    return power(power(x,n/2),2);
                } 
                else {
                    return x*power(x,n-1);
                }
            }
        }
    }
}

