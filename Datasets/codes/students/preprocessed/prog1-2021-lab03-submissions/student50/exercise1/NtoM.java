import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please input a value for n: ");
        int n = sc.nextInt();
        System.out.println("Please input a value for m: ");
        int m = sc.nextInt();


        for (int i= n; i < m+1;i++){
             System.out.println(i);
        }
        sc.close();
       
    }
}
