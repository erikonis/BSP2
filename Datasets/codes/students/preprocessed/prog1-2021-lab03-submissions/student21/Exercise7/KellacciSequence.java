import java.util.Scanner;

public class KellacciSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer that is greater than 2 : ");

        int number = scanner.nextInt();

        while (number<=2){
        System.out.println("Error the integer has to be greater than 2 !");

        number = scanner.nextInt();}


        int K1, K2 , Kn, valueN;

        K1=1;
        K2=1;
        Kn=0;
        valueN = 0;

        System.out.println("K" + ++valueN + " = " + K1);
        System.out.println("K" + ++valueN + " = " + K2);

        while (number > 2) {

        Kn = (K2-1) + (K1*2);
        System.out.println("K" + ++valueN + " = " + Kn);

        K1=K2;
        K2=Kn;
        --number;


        }
        scanner.close();
        
    }
    
}
