/** 
 * The BeerSong class implements an application that
 * displays bottle song by using if-else operator.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-13 
 */
public class BeerSong {
     /** 
 * This main method sets starting number of bottles as x
 * and ivokes 'bottles' method. 
 */
    public static void main(String[] args) {
        int x = 99;
        bottles(x);
    }
 /** 
 * This method prints song verses and decrement x until
 * it reaches 0. Then it prints set of statements and ends.
 * escape sequences.
 */
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
