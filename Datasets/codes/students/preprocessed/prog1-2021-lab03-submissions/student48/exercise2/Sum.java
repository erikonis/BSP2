import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        int sum = 0;
        int i;

        for (i = 1; i<=n; i++) {
            sum += i;
        }
        System.out.println("For: " + sum);

        i = 1;
        sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("While: " + sum);

        i = 1;
        sum = 0;
        do {
            sum += i;
            i++;
        } while (i<=n);
        System.out.println("Do while: " + sum);

        System.out.println("Formula: " + n*(n+1)/2);

        input.close();
    }

}
