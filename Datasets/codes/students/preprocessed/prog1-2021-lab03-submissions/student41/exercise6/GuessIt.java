import java.util.Random;
import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        //sets up random and scanner
        int goal = rand.nextInt(100)+1;
        int g = 0;
        int c = 1;
        //chooses a random number between 1 and 100, sets the default guess to 0, and counter to 1
        System.out.println("Guess what number has been selected from 1 to 100");
        System.out.print("What is your guess?: ");
        g = scanner.nextInt();
        //asks for input
        while(g != goal){
            if(g>goal){System.out.println("Too big");}
            if(g<goal){System.out.println("Too small");}
            c++;
            System.out.print("Try again: ");
            g = scanner.nextInt();}
            //as long as the guess isn't the random number:
            //prints if it's bigger or smaller than the goal
            //adds 1 to the counter
            //asks for a new input
        System.out.println("You guessed correctly with "+g+", it took you "+c+" attempts");
    scanner.close();
    }
}
