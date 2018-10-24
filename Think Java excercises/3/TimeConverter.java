import java.util.Scanner;
/** 
 * The TimeConverter class implements an application that
 * takes number of seconds as user input and changes them to
 * amount of hours, minutes and seconds.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-13 
 */
public class TimeConverter {
    /** 
     * Takes user input in seconds, tranform them to hours, 
     * minutes and seconds, and prints them in order. 
     */
    public static void main(String args[]){
        /**
         * Declaration of Scanner variable 'console', creating
         * new Scanner object with input stream as parameter in it.
         * After printed question, user input as integer will be
         * stored in 'inputSeconds' variable.
         */
        Scanner console = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int inputSeconds = console.nextInt();
        /**
         * Amount of inputted seconds is divided by 3600 (number of seconds in hour)
         * to obtain number of hours, then takes modulus from these seconds 
         * as seconds left, and number of minutes is calculated by dividing seconds 
         * left by 60 (number of seconds in minute). Then it prints all relevant
         * values and closes input.
         */
        int hour = inputSeconds / 3600;
        int second = inputSeconds % 3600;
        int minute = second / 60;
        second = second % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds.\n", 
                          inputSeconds, hour, minute, second);
        console.close();
    }
}
/**
 * Ideas of improving this class:
 * > react to invalid inputs (beyond type)
 */
