import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        int random = ((int) (Math.random() * 100) + 1), tries = 0, number;
        //System.out.println(random);
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        while (found != true) {
            System.out.println("Please enter the number which you want to guess between 1-100");
            number = scanner.nextInt();
            if (number > random) {
                System.out.println("The guessed number was bigger than the searched number");
                tries = tries + 1;
            }
            if (number < random) {
                System.out.println("The guessed number was smaller than the searched number");
                tries = tries + 1;
            }
            if (number == random) {
                System.out.println("You have found the number");
                tries = tries + 1;
                found=true;
            }

        }
        System.out.println("You tried " + tries + " times until you guessed the number right");
        scanner.close();

    }

}
