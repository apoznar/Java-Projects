public class Gauss {
    
    public static void main(String[] args) {
        System.out.println(gauss(1,1));
    }
    
    public static double gauss(double x, int n){
        double result = 1;
        int q = 1;
        double p = 1;
        int pre = 1;
        for (int i=1;i<n;i++){
            result += (pre*=-1)*(p*=x*x)/(q*=i);
        }
        return result;
    }
}