import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the n number: ");

         int n = scanner.nextInt();

        System.out.print("Please input the m number: ");

         int m = scanner.nextInt();

        
     for (int ntom = n; ntom <= m; ntom++) {
            System.out.println(ntom);
    } 

    scanner.close();
 }
}
