public class Sieve {
    
    public static void main(String[] args) {
    }
    
    public static boolean[] sieve(int n){
        boolean[] result = new boolean[n];
        for (int i=2;i<n;i++)
            result[i] = true;
        for (int number=2;number<=(int)Math.sqrt(n);number++){
            if (result[number] == true){
                for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
                    result[indexInSeries] = false;
                }
            }
        }
        return result;
    }
}