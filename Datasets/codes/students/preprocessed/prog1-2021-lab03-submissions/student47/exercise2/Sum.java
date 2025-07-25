import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        // FOR LOOP

        // for (n=0; n<=0 ; n=n+0 ) {
        // System.out.println("what would be n?");
        // n = scanner.nextInt();
        // for(int i=0; i<=n; i++){
        // sum = sum + i;
        // }
        // }
        // System.out.println("The sum is : " + sum );

        // WHILE LOOP
        // int j = 0;

        // while (n <= 0) {
        // System.out.println(n <= 0 ? "What would be n?" : " ");
        // n = scanner.nextInt();
        // while (j < n) {
        // j++;
        // sum = sum + j;
        // }
        // }
        // System.out.println("The sum is : " + sum);

        // DO-WHILE LOOP
        int h = 0;

        do {
            do {
                System.out.println(n <= 0 ? "What would be n?" : " ");
                if (n <= 0) {
                    n = scanner.nextInt();
                }
            } while (n <= 0);

            h++;
            sum = sum + h;
        } while (h < n);
        System.out.println("The sum is : " + sum);

        // MATHS FORMULA

        int mathsum = ((n * n) + n) / 2;
        System.out.println("With the maths formula : " + mathsum);

        scanner.close();

    }
}
