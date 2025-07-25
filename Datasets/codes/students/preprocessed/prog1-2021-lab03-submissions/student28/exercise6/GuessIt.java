import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class GuessIt {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Guess a number between 1 and 100. Enter 0 to stop");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int fixed = ThreadLocalRandom.current().nextInt(1, 101);
        while (guess != 0)
        {
            //check if the guessed number is correct
            if(guess == fixed)
            {
                System.out.println("You made the correct guess of "+guess);
                break;
            }else if(guess < fixed)
            {
                System.out.println("The correct number is more than "+guess);
                System.out.println("Guess a number between 1 and 100. Enter 0 to stop");
                guess = input.nextInt();
            }else
            {
                System.out.println("The correct number is less than "+guess);
                System.out.println("Guess a number between 1 and 100. Enter 0 to stop");
                guess = input.nextInt();
            }
        }
        
    }
    
}
