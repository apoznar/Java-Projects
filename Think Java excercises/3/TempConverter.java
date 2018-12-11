import java.util.Scanner;
/** 
 * The TempConverter class implements an application that
 * takes input from user in doubles as Celsius value, 
 * changes it to Fahrenheit value and prints it within an equasion.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-13 
 */
public class TempConverter {
    /** 
     * Takes user input in doubles, changes it to another and prints both of them.
     */
    public static void main(String args[]){
        /**
         * Declaration of Scanner variable 'console', creating
         * new Scanner object with input stream as parameter in it.
         * After printed question, user input as double will be
         * stored in 'temperature' variable.
         */
        Scanner console = new Scanner(System.in);
        System.out.print("Input temperature in Celsius: ");
        double temperature = console.nextDouble();
        /**
         * Computes Fahrenheit value from input by using equation,
         * prints them both in a form of another eqation and closes input.
         */
        double temperatureInF = temperature * 9 / 5 + 32;
        System.out.printf("%.1f C = %.1f F\n", temperature, temperatureInF);
        console.close();
    }
}
/**
 * Ideas of improving this class:
 * > react to ivalid inputs (beyond scale, type)
 */
