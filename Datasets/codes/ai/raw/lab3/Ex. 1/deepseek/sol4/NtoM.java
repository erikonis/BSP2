import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n > m) throw new IllegalArgumentException("n must be ≤ m");
            for (; n <= m; n++) System.out.println(n);
        }
    }
}