import java.util.Random;
import java.util.Scanner;

public class GuessGame{
    private static Scanner console = new Scanner(System.in);
    
    public static void main(String args[]){
        
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        guess(answer);
        
    }
    
    private static void guess(int answer){
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        
        int input = console.nextInt();
        
        if (input == answer){
            System.out.println(input + " is correct!");
        }
        else {
            System.out.println(input + " is too " + (input > answer ? "high" : "low"));
            System.out.println("Try again\n");
            guess(answer);
        }
    }
}