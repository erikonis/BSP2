import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (n<=0) {
            System.out.print("Please enter a positive interger number: ");
            n = scanner.nextInt();
        }

        int sum = 0;
        int i = 0;

        //for loop
        for (i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println("For loop: The sum of the numbers from 1 to " + n + " is " + sum);
        sum = 0;
        i = 1;

        //while loop
        while  (i <= n) {
            sum += i;
            i += 1;
        }
        System.out.println("While loop: The sum of the numbers from 1 to " + n + " is " + sum);
        sum = 0;
        i = 1;

        //do-while loop
        do {
            sum += i;
            i += 1;
        } while (i <= n);
        
        System.out.println("Do-while loop: The sum of the numbers from 1 to " + n + " is " + sum);

        //formula
        System.out.println("Formula: The sum of the numbers from 1 to " + n + " is " + (n*(n+1))/2);

        scanner.close();
    }
}