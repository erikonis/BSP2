import java.util.Scanner;

public class Sum {
  

   public static void main(String[] args) {
                
      int n, count, total = 0;    

        System.out.println("Enter the value of n:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        for (count = 1; count <= n; count++){
            total = total + count;
        }

        System.out.println("Sum of first " + n + " natural number is " + total);

             }
        }

