import java.util.Scanner;
public class NtoM {
    public static void main(String[] args) {
        //initialze scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to stat with:");
        int n = scanner.nextInt();
        System.out.println("Please enter the number until then you want to count: ");
        int m = scanner.nextInt();

        for(int i = n ; i<m+1;i++)
        {
            System.out.println(i);
        }
        //scanner close
        scanner.close();
    }
}
