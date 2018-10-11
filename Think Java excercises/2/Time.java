/** 
 * The Time class implements an application that
 * shows various data based on set time in strings.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-11 
 */
public class Time {
   /**
   * This is the main method which makes use of set variables
   * by printing number of seconds since midnight, remaining
   * seconds in a day, fraction of a day spent that has passed
   * and seconds spent on this excersize.
   */
    public static void main(String[] args) {
        /* Here are variables that has to be set
        * by user before running method. */
        int hour = 12;
        int minute = 37;
        int second = 20;
        /* Calculates number of seconds in passed hours,
        * number of seconds in passed minutes and seconds, 
        * then sums them up and come up with an answer. */
        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 3600 + minute * 60 + second);
        /* Substracts remaining hours, minutes and seconds in a day,
        and then counts number of seconds remaining exactly like above */
        int hour2 = 24 - hour;
        int minute2 = 60 - minute;
        int second2 = 60 - second;
        System.out.print("Number of seconds remaining in a day: ");
        System.out.println(hour2 * 3600 + minute2 * 60 + second2);
        /* First variables needs to be changed here to doubles by user,
        * then calculates remaining seconds in a day like above,
        * and then divides sum of these seconds by overall amount
        * of seconds in a day.*/
        double hour3 = 12.0;
        double minute3 = 37.0;
        double second3 = 20.0;
        double SECONDS_IN_A_DAY = 86400.0;
        double passedSeconds = hour3 * 3600 + minute3 * 60 + second3;
        double fraction = passedSeconds / secondsInADay;
        System.out.print("Fraction of the day that has passed: ");
        System.out.println(fraction + " %");
        /* First variables needs to be changed here by user,
        * then it calculates elapsed seconds by counting them like above,
        * except using substraction of two set times instead */
        int hour4 = 13;
        int minute4 = 13;
        int second4 = 45;
        int elapsedTimeInSeconds = (hour4 - hour) * 3600 + (minute4 - minute) * 60 + (second4 - second);
        System.out.print("Elapsed time since I started working: ");
        System.out.println(elapsedTimeInSeconds + " seconds.");
    }
}
