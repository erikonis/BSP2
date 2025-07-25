import java.util.Scanner;
public class Kellacci {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number n: ");
        int n = scanner.nextInt();


        for(int i = 1;i<=n;i++)
        {
            if(i<=2)
            {
                System.out.println("For "+ i +": "+1);
            }
            else
            {
                int Kn = ((i-1)-1) + ((i-2)*2);
                System.out.println("For "+ i +": "+Kn);
            }
        }

        //scanner close
        scanner.close();
    }
}
