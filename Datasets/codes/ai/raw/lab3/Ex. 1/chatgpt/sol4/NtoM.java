import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        while (n <= m) {
            System.out.println(n++);
        }
    }
}
