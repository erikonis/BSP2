import java.util.Scanner;

public class NtoM {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter beginning integer: ");

                int n = scanner.nextInt();

            System.out.println("Please enter ending integer: ");


                for (int m = scanner.nextInt(); n <= m; System.out.println(n++));
            
        scanner.close();
    }
    
}
