public class MultAdd {
    
    public static void main(String[] args) {
        System.out.println(multAdd(1.0, 2.0, 0.0));
    }
    
    public static double multAdd(double a, double b, double c) {
        double multAddFlag = a * b + c;
        double firstCompute = (Math.sin(Math.PI/4.0)) 
            + (Math.cos(Math.PI/4.0))/2.0;
        double secondCompute = Math.log(10) + Math.log(20);
        System.out.println(firstCompute);
        System.out.println(secondCompute);
        expSum(2.0);
        return multAddFlag;
    }
    public static double expSum(double x) {
        double expCompute = x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
        return expCompute;
    }
}
