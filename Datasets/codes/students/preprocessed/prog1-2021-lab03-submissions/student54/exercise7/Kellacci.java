import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        int n,n1=1, n2=1, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value for n:");
        n= scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                sum=(n1-1)+(n2*2);
                n2=n1;
                n1=sum;
                System.out.print(sum+" ");
            }
        }
        scanner.close();
    }
}
