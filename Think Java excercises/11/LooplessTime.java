/**
 * The Loopless class implements an application that 
 * changes increment method to one that does not use loops.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-21
 */
public class LooplessTime {
    /** 
     * This main method creates a new LooplessTime object called time,
     * modify it through increment method using given argument and prints object.
     */
    public static void main(String[] args) {
        LooplessTime time = new LooplessTime();
        time.increment(3600 * 8 + 6 * 60 + 5);
        System.out.println(time);
    }
    public int hour;
    public int minute;
    public double second;
    /** 
     * This constructor takes parameters and initializes the instance variables.
     */
    public LooplessTime(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /** 
     * Sets parameter values to a constructor.
     */
    public LooplessTime() {
        this(0, 0, 0);
    }
    /** 
     * Returns instance variables in a form of a string.
     */
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
    /** 
     * Does an incrementation of time - counts final state of variables.
     */
    public void increment(double seconds) {
        this.second += seconds;
        this.minute += this.second / 60;
        this.second %= 60;
        this.hour += this.minute / 60;
        this.minute %= 60;
    }
}
