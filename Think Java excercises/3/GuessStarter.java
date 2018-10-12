import java.util.Random;
import java.util.Scanner;
/** 
 * The GuestStarter class implements an application that
 * takes desired input from user, generates random number,
 * and then prints both of them with difference between them.
 *
 * @author  Adam Poznar
 * @version 1.1
 * @since   2018-09-12 
 */
public class GuessStarter {
   /**
   * This is the main method which takes input between 1-100,
   * generates random number within this range, computes difference
   * between both of them and prints them altogether.
   */
   public static void main(String args[]){
      /**
      * Declaration of Scanner variable 'input', creating
      * new Scanner object with input stream as parameter in it.
      * After printed question, user input as integer will be
      * stored in 'guess' variable.
      */
      Scanner input = new Scanner(System.in);
      System.out.println("Tell me number between 1-100: ");
      int guess = input.nextInt();
      /**
      * Declaration of Random variable 'random', creating
      * new Random object without parameters.
      * Generated number (1-99 + 1) will be stored in 'number' variable.
      * After that it takes substraction of guess from number
      * and gets absolute value by Math package and stores it in 'diff' variable.
      */
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      int diff = Math.abs(guess - number);
      /**
      * Prints inputted number, generated number and difference between them,
      * closing input after them.
      */
      System.out.printf("Your guess was %d\n", guess);
      System.out.printf("Random number was %d\n", number);
      System.out.printf("You were off by %d\n", diff);
      input.close();
   }
}
      /**
      * Ideas of improving this class:
      * > react to ivalid inputs (beyond scale, type)
      */
