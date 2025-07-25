import java.util.Scanner;

public class Kellacci {

    static int k1=1, k2=1, k3=0;

    static void printKellaci(int count){
        if(count>0){
            k3 = (k2-1) + (k1*2);
            k1=k2;
            k2=k3;
            System.out.println(" "+k3);
            printKellaci(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number 'n' for the count amount in Kellacci formula:");
        int n = scanner.nextInt();

        System.out.println(" "+k1+"\n "+k2);
        printKellaci(n-2);

        scanner.close();
    }    
}
