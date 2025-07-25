// NtoM.java
import java.util.Scanner;
import java.util.stream.IntStream;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        IntStream.rangeClosed(n, m).forEach(System.out::println);
        scanner.close();
    }
}