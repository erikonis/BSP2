import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}