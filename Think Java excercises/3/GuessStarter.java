import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Tell me number between 1-100: ");
      int guess = input.nextInt();
      
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      int diff = Math.abs(guess - number);
      
      System.out.printf("Your guess was %d\n", guess);
      System.out.printf("Random number was %d\n", number);
      System.out.printf("You were off by %d\n", diff);
      input.close();
   }
}