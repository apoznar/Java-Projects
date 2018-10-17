/**
 * The Hello class implements an application that 
 * displays "Hello World!" to the standard output
 * and uses some escape sequences.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class MyExp {
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static void main(String[] args) {
        for (double i=0.1; i<=100; i*=10){
            check(i); 
        }
        System.out.println(myexp(2.0,3));
        check();
    }
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static double myexp(double x, int n){
        double result = 1;
        double p = 1;
        double q = 1;
        for (int i=1;i<n;i++){
            result += (p*=x)/(q*=i);
        } 
        return result;
    }
     /** 
 * This main method prints Hello World output
 * and tests newline, tab & double quote 
 * escape sequences.
 */
    public static void check(double x){
        int i = 28;
        // double interval = 0;
        // do{
        // i++;
        // interval = Math.abs(myexp(x,i) - Math.exp(x));
        // System.out.println(i+"\t"+interval);
        // }
        // while (interval > 0.0000000000000001);
        System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));
    }
}


///COS TU NIE DZIA£A< POPRAWIMY
