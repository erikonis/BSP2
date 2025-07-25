import java.util.Scanner;

public class NtoM {
    
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number m : ");
        int m = scanner.nextInt();
        System.out.println("Enter the number n : ");
        int n = scanner.nextInt();

        for (int i = n  ; i<= m ; i++)
            System.out.println(i);
        for (int j = m;  j<= n ; j++)
            System.out.println(j);


        scanner.close();    

    }

}
