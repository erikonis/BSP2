import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Kella1 = 1;
        int Kella2 = 1;
        int k, c = 1;
        int num;
        System.out.print("Enter a number for Kellacci : ");
        num = scanner.nextInt();
        switch (c) {
        case 1, 2:
            for (int i = 0; i < 2; i++) {
                System.out.println(1);
                ++c;
            }
        default:
            for (int i = 3; i <= num; i++) {
                k = (Kella1 - 1) + (Kella2 * 2);
                System.out.println(k);
                Kella2 = Kella1;
                Kella1 = k;
            }
        }
        scanner.close();
    }
}