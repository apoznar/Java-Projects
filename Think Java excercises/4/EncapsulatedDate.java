/** 
 * The EncapsulatedDate class implements an application that
 * displays set date in different formats using multiple methods.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-14 
 */
public class EncapsulatedDate {
    /** 
     * This main method contains four variables as a date
     * and invokes two other methods with them.
     */
    public static void main(String[] args) {
        String day = "Tuesday";
        int date = 18;
        String month = "September";
        int year = 2018;
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
    /** 
     * Takes four variables from main method and prints them in American format.
     */
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    /** 
     * Takes four variables from main method and prints them in European format.
     */
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
