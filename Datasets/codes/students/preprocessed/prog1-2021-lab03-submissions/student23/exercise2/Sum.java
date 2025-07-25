import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input n :");
        int n = scan.nextInt();

        int sum = n*(1+n)/2; //formula for the sum of the first n digit of a sequance

        System.out.println("The sum of all number between 1 and " + n + " is : " + sum);

        scan.close();
    }
    
}
