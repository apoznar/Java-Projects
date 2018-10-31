/**
 * The Date class implements an application that 
 * prints birthday date. It provides two constructors,
 * one with no parameters and initialize default date,
 * other take parameters and use them to initialize
 * the instance variables.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-21 
 */
public class Date {
    /** 
     * This main method creates a new Date object called birthday
     * and prints its instance variables in appropriate order.
     */
    public static void main(String args[]) {
        Date birthday = new Date();
        System.out.println(birthday.year + " " + birthday.month +
                           " " + birthday.day);
    }
    /** 
     * Initializing instance variables.
     */
    public int year;
    public int month;
    public int day;
    /** 
     * Constructor with parameters to initialize instance variables.
     */
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /** 
     * Constructor with no parameters.
     */
    public Date() {
        this(1991, 3, 8);
    }
}
