import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K1 = 1;
        int K2 = 1;
        int k, c = 1;
        int num;

        System.out.print("Please enter integer number n for Kellacci formula: ");
        num = sc.nextInt();
        switch (c) {
        case 1, 2:
            for (int i = 0; i < 2; i++) {
                System.out.println(1);
                ++c;
            }
        default:
            for (int i = 3; i <= num; i++) {
                k = (K1 - 1) + (K2 * 2);
                System.out.println(k);
                K2 = K1;
                K1 = k;
            }
        }

        sc.close();
    }
}
