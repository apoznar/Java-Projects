public class EncapArrays {
    
    public static void main(String[] args) {
    }
    
    public static double[] powArray(double[] array, double power){
        double[] accumulator = new double[array.length];
        for (int i=0;i<array.length;i++){
            accumulator[i] = Math.pow(array[i],power);
        }
        return accumulator;
    }
    
    public static int[] histogram(int[] array, int count){
        int[] counter = new int[count];
        for (int element:array){
            counter[element]++;
        }
        return counter;
    }
}
