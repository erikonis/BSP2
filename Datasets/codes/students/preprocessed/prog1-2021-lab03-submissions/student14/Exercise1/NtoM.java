import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");

        // This method reads the number provided using keyboard
        int n = scanner.nextInt();
        System.out.print("Enter M: ");
        int m = scanner.nextInt();
        int i;
        // Closing Scanner after the use
        scanner.close();
        for (i = n; i <= m; i++) {
            System.out.println(i);
        }

    }

}
