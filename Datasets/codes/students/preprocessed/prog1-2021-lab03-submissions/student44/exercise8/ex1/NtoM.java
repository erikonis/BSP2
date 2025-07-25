import java.util.Scanner;
public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of N and M");
        int N = scanner.nextInt();
        int M = scanner.nextInt(); 
        while (N < M+1) {
            System.out.println(N);
            N++;
            }
        scanner.close();
    }
}
