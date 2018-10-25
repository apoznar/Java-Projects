import java.util.Random;
import java.util.Scanner;
/** 
 * The GuessGame class implements an application that
 * generates number, makes user guess it by input another
 * and tells him how far off is he from right answer.
 *
 * @author  Adam Poznar
 * @version 1.2
 * @since   2018-09-15 
 */
public class GuessGame {
    /** 
     * This main method makes possible user input between 1 and 100,
     * ganerates random number and invokes 'guess' method with
     * 'answer' argument variable.
     */
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        guess(answer);
    }
    /** 
     * Prints few statements and encourage user to input number.
     * Makes if-else loop to check if this input is correct or how far off was user
     * and invokes method again. Else branch prints different output if input number
     * is too high or too low by using nested shortened if-else loop.
     */
    private static void guess(int answer) {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int input = console.nextInt();
        if (input == answer) {
            System.out.println(input + " is correct!");
        }
        else {
            System.out.println(input + " is too " + (input > answer ? "high" : "low"));
            System.out.println("Try again\n");
            guess(answer);
        }
    }
}
