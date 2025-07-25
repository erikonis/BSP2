import java.util.Scanner;

public class NtoM {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asks for input
        System.out.println("Enter the first and last number you want to print:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Prints numbers from given n to given m
        for(int i = n; i <= m; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
