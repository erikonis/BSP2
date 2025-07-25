import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a positive integer: ");
            
                int n = scanner.nextInt();

            while (n < 0)
                {
                    System.out.println("Please retry, " + n + " is not a positive integer.");

                        n = scanner.nextInt();
                }
                int sum = 0;
                int sumcount = 0;
            do 
                {
                    sum = sum + (sumcount);
                    n--;
                    sumcount++;
                }

            while    (n >= 0);
        scanner.close();

        System.out.println(sum);
            
    }
    
}
