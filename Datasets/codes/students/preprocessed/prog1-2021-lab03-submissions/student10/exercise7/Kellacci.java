import java.util.Scanner;

public class Kellacci {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n= scanner.nextInt();
    int k,k1=1,k2=1;

    System.out.println("Kellacci Numbers:");

    for(int i=0;i<n;i++){

        if(i<2)
            System.out.println(1);
        else{

            k=(k1-1)+(k2*2);
            k2=k1;
            k1=k;

            System.out.println(k);
        }
    }
    scanner.close();
}
}
