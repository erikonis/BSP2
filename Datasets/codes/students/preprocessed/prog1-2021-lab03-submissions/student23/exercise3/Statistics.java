import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nb = 0;
        int sum = 0;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        int input = 1;


        while (input != 0){
            System.out.println("Input a number (type 0 to stop)\nCurrently " + nb + " inputs.");
            input = scan.nextInt();

            if (input == 0) {break;}

            nb += 1;

            sum += input;

            if (nb > large) {large = nb;}
            if (nb < small) {small = nb;}
        }
        System.out.println("The average of your sequence of number is : "+ (sum/nb));
        System.out.println("The smallest value was : " + small);
        System.out.println("The highest value was : " + large);

        scan.close();
    }
    
}
