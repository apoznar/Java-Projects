public class SquareRoot {
    
    public static void main(String[] args) {
        squareRoot(2);
    }
    
    public static double squareRoot(double a){
        double oldValue = a/2;
        double newValue = a/2;
        double interval = 0;
        do {
            oldValue = newValue;
            newValue = (oldValue + a/oldValue)/2;
            interval = Math.abs(newValue - oldValue);
            System.out.println(interval);
        } while(interval > 0.001);
        return newValue;
    }
}