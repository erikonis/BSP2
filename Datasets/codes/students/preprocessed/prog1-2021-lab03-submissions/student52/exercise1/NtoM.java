import java.util.Scanner;

public class NtoM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the integer value for 'n':");
        int n = scanner.nextInt();

        System.out.println("Please enter the integer value for 'm':");
        int m = scanner.nextInt();

        System.out.println("-----------");

        for(int i=n; i<=m; i++){
            System.out.println(i);
        }

        scanner.close();
    }
    
}
