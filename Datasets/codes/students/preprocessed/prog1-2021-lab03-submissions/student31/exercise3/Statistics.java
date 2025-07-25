import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double count = 0;
        int sum = 0;
        int number = 1;
        int small = 2147483647;
        int large = -2147483648;

        while (number != 0) {
            System.out.print("Please enter an integer number, to stop enter \"0\": ");
            number = scanner.nextInt();

            //0 isn't counted into the sequence
            if (number != 0) {
                count += 1;
                sum += number;
            }

            //check if smallest number that is not zero
            if (number < small && number != 0) {
                small = number;
            }

            //check if largest number
            if (number > large) {
                large = number;
            }
        }

        System.out.println("The smallest number is: " + small + "\nThe largest number is: " + large + "\nThe average of the numbers is: " + sum/count);

        scanner.close();
    }
}