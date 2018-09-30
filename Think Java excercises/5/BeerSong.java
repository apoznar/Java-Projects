//this class runs through "99 bottles of beer" song.

public class BeerSong {
    
    public static void main(String[] args) {
        int x = 99;
        bottles(x);
    }
    
    public static void bottles(int x) {
        if (x == 0) {
            System.out.println("No bottles of the beer on the wall,\n" +
                               "No bottles of beer,\n" +
                               "ya' can't take one down, ya' can't pass it around,\n" +
                               "'cause there are no more bottles of beer on the wall!"); 
            System.out.println(); }
        
        else {
            System.out.println(x + " bottles of the beer on the wall,\n" +
                               x + " bottles of beer,\n" +
                               "ya' take one down, ya' pass it around,\n" +
                               x-- + " bottles of beer on the wall!");
            bottles(x);
        }
    }
}