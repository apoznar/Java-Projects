import java.util.Scanner;

public class TimeConverter {
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("Input number of seconds: ");
      int inputSeconds = console.nextInt();
      int hour = inputSeconds / 3600;
      int second = inputSeconds % 3600;
      int minute = second / 60;
      second = second % 60;
      System.out.printf("%d seconds = %d hours, %d minutes, %d seconds.\n", 
      inputSeconds, hour, minute, second);
      console.close();
   }
}