import java.util.Scanner;


public class NtoM {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the first number");
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        System.out.println("Enter the last number");
        int m = input.nextInt();
        for(int i = n; i<m+1; i++)
        {
            System.out.println(i);
        }
    }
    
}
