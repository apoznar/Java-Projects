/** 
 * The Date class implements an application that
 * prints desired date in American and European format.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class Date {
   /**
   * This is the main method which takes parameters from
   * set strings and prints them in both formats.
   * Commented lines are just for checking outputs.
   */
    public static void main(String[] args) {
        String day = "Tuesday";
        int date = 18;
        String month = "September";
        int year = 2018;
        //System.out.println(day);
        //System.out.println(date);
        //System.out.println(month);
        //System.out.println(year);
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
