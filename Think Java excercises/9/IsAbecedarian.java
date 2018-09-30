public class IsAbecedarian {
    
    public static boolean isAbecedarian(String str){
        String converted = str.toUpperCase();
        for (int i = 0;i<converted.length() - 1;i++){
            char c = converted.charAt(i);
            if (c >= 65 && c <= 90){
                if (c > converted.charAt(i+1)){
                    return false;
                } 
            } 
            else {
                return false;
            }
        }
        return true;
    }
}