import java.util.ArrayList;
import java.util.Scanner;

public class Kellacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<Integer> klist = new ArrayList<>();
        klist.add(1);
        klist.add(1);
        System.out.println("Please enter n: ");
        n = scanner.nextInt();

        for(int i=1; i<=n;i++)
        {
            if(i<=2) {System.out.println("1");}
            else 
            {
                int kn = (klist.get(i-2)-1)+(klist.get(i-3)*2);
                klist.add(kn);
                System.out.println(kn);
            }
        }
    }
}
