import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
    int n, m;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer number n: ");
    n = scanner.nextInt();
    System.out.println("Enter an integer number m: ");
    m = scanner.nextInt();
    System.out.println("Integer numbers from n to m: ");
    for(int i = n; i <=m; ++i) {
    System.out.println(i);
    }
    scanner.close();
    }
}
