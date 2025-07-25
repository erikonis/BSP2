package lu.uni.programming1.lab3.exercise6;

import java.util.Scanner;

public class GuessIt {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        int solution = (int)(Math.random()*100);        // Random number between 1-100
        int count = 0;      //Guess count

        // Guess it!
        System.out.println("Guess the number (1-100):");
        int guess = sc.nextInt();
        count++;
        while(guess != solution){
            if(guess < solution){
                System.out.println("Higher");
                guess = sc.nextInt();
                count++;
            }else{
                System.out.println("Lower");
                guess = sc.nextInt();
                count++;
            }
        }
        System.out.println("Great! You guessed the number!");
        System.out.println("Amount of guesses: " + count);

        sc.close();
    }
}
