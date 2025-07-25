import java.util.Scanner;

/**
 * GuessIt
 */
public class GuessIt {

    public static void main(String[] args) {
        int random = (int)(Math.random()*101);

        Scanner scanner = new Scanner(System.in);
        int n=0;
        int guess = -1;
        while(guess!=random){
            System.out.println("Guess what's the number: ");
            guess = scanner.nextInt();
            if(guess>random) System.out.println("The number is smaller");
            else if(guess<random) System.out.println("The number is bigger");
            n++;
        }   
        System.out.println("Congratulations, you guessed up the number! You took "+n+" tries");
    }
}