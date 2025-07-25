import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int n= scanner.nextInt();

        int i=1;
        int k1=1;
        int k2=1;

        System.out.println("Kellacci sequence to the " + n + " term: ");

        while(i<=n)
        {
            System.out.print(k1 + " ");
            int sum=(k2-1)+(k1*2);
            k1= k2;
            k2=sum;
            i++;
        }

        scanner.close();
    }
}
